package com.sadeesha.awsimageupload.bucket;

public enum AWSBucketName {

    //creating an enum for the bucket name
    PROFILE_IMAGE("nightox-aws-image-upload");

    //declaring the string variable as private final
    private final String bucketName;

    //creating a overload constructor
    AWSBucketName(String bucketName){
        this.bucketName = bucketName;
    }

    //creating a getter to get the bucket name in enum
    public String getBucketName() {
        return bucketName;
    }
}
