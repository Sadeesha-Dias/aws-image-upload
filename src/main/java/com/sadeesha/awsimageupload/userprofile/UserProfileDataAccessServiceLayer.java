package com.sadeesha.awsimageupload.userprofile;

import com.sadeesha.awsimageupload.userdata_store.MockUserProfileDataStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserProfileDataAccessServiceLayer {
    private final MockUserProfileDataStore mockUserProfileDataStore;

    @Autowired
    public UserProfileDataAccessServiceLayer(MockUserProfileDataStore mockUserProfileDataStore) {
        this.mockUserProfileDataStore = mockUserProfileDataStore;
    }

    List<UserProfile> getUserProfileDAL(){
        return mockUserProfileDataStore.getUserProfileList();
    }
}
