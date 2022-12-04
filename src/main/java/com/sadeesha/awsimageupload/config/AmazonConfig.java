package com.sadeesha.awsimageupload.config;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.sadeesha.awsimageupload.Main;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
public class AmazonConfig {
    public AmazonConfig() throws IOException {
    }
    Main mainClass = new Main(); //create an object from main class

    String accKey = mainClass.readAccessKey(); //passing the AWS accessKey
    String secKey = mainClass.readSecretKey(); //passing the AWS secretKey

    @Bean
    public AmazonS3 s3Config(){
        AWSCredentials awsCredentials = new BasicAWSCredentials(
                accKey,
                secKey
        );
        return AmazonS3ClientBuilder
                .standard()
                .withRegion("us-east-1")
                .withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
                .build();
    }
}
