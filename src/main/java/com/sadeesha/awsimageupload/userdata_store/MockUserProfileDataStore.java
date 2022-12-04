package com.sadeesha.awsimageupload.userdata_store;

import com.sadeesha.awsimageupload.userprofile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class MockUserProfileDataStore {
    private static final List<UserProfile> USER_PROFILE_LIST = new ArrayList<>();

    static{
        USER_PROFILE_LIST.add(new UserProfile(UUID.randomUUID(), "Callipso Windy", null));
        USER_PROFILE_LIST.add(new UserProfile(UUID.randomUUID(), "Jack McWood", null));
        USER_PROFILE_LIST.add(new UserProfile(UUID.randomUUID(), "Nina Ellie", null));
        USER_PROFILE_LIST.add(new UserProfile(UUID.randomUUID(), "Amy Juventus", null));
    }

    public static List<UserProfile> getUserProfileList() {
        return USER_PROFILE_LIST;
    }
}
