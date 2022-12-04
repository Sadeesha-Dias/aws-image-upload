package com.sadeesha.awsimageupload.userprofile;

import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

public class UserProfile {
    private UUID userProfileId;
    private String username;
    private String userProfileImageKey; // This is the key associated with a particular image in S3.

    //constructor
    public UserProfile(UUID userProfileId, String username, String userProfileImageKey) {
        this.userProfileId = userProfileId;
        this.username = username;
        this.userProfileImageKey = userProfileImageKey;
    }

    //getters and setters
    public UUID getUserProfileId() {
        return userProfileId;
    }

    public void setUserProfileId(UUID userProfileId) {
        this.userProfileId = userProfileId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Optional<String> getUserProfileImageKey() {
        return Optional.ofNullable(userProfileImageKey);
    }

    public void setUserProfileImageKey(String userProfileImageKey) {
        this.userProfileImageKey = userProfileImageKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserProfile that = (UserProfile) o;
        return Objects.equals(userProfileId, that.userProfileId) &&
                Objects.equals(username, that.username) &&
                Objects.equals(userProfileImageKey, that.userProfileImageKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userProfileId, username, userProfileImageKey);
    }
}
