package com.sadeesha.awsimageupload.filestore;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.ObjectMetadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.Map;
import java.util.Optional;

@Service
public class FileStore {
    private final AmazonS3 s3Config;
    @Autowired
    public FileStore(AmazonS3 s3Config) {
        this.s3Config = s3Config;
    }

    //save image to the bucket
    public void saveImage(String path, String fileName,
                          Optional<Map<String, String>> optionalMetadata, InputStream inputStream){

        ObjectMetadata metadata = new ObjectMetadata();

        optionalMetadata.ifPresent(map -> {
            if(!map.isEmpty()){
                map.forEach(metadata::addUserMetadata);
            }
        });

        try{
            s3Config.putObject(path, fileName, inputStream, metadata);
        }
        catch (AmazonServiceException e){
            throw new IllegalStateException("Failure! unable to store file to s3", e);
        }
    }



}
