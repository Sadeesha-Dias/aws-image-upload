package com.sadeesha.awsimageupload.userprofile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/user-profile")
public class UserProfileController {
    private final UserProfileService userProfileService_BAL;

    @Autowired
    public UserProfileController(UserProfileService userProfileServiceBal) {
        userProfileService_BAL = userProfileServiceBal;
    }

    @GetMapping
    public List<UserProfile> getUserProfile(){
        return userProfileService_BAL.getUserProfileBAL();
    }
    @PostMapping(
            path = "{userProfileId}/profile-image/upload",
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public void uploadUserProfileImage(@PathVariable("userProfileId")UUID userProfileId,
                                       @RequestParam("file") MultipartFile file){
        userProfileService_BAL.uploadUserImage(userProfileId, file);

    }
}
