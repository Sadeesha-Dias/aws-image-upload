package com.sadeesha.awsimageupload.userprofile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;

@Service
public class UserProfileService {
    private final UserProfileDataAccessServiceLayer dataAccessServiceLayer;

    @Autowired
    public UserProfileService(UserProfileDataAccessServiceLayer dataAccessServiceLayer) {
        this.dataAccessServiceLayer = dataAccessServiceLayer;
    }

    List<UserProfile> getUserProfileBAL(){
        return dataAccessServiceLayer.getUserProfileDAL();
    }

    public void uploadUserImage(UUID userProfileId, MultipartFile file) {
        // 1. check if the image is not empty
        // 2. if the file is an image
        // 3. if the user exists on our database.
        // 4. grab some metadata from file if any exist
        // 5. store the image in s3 and update database with s3 image link (userProfileImageKey)
    }
}
