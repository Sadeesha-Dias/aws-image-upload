package com.sadeesha.awsimageupload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.util.Scanner;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	//reading the AWS accessKey from a file
	public String readAccessKey() throws IOException {
		String accKey;
        String accKeyCanonicalPath;

		File accessFile = new File("C:\\Users\\Admin\\Desktop\\Personal_Projects\\Access_keys\\accessKey.txt");

		//validating file path to prevent path traversal vulnerability
        accKeyCanonicalPath = accessFile.getCanonicalPath();
        if(!accKeyCanonicalPath.equals("C:\\Users\\Admin\\Desktop\\Personal_Projects\\Access_keys\\accessKey.txt")){
			System.out.println("Invalid accessKey file: File path is different or the file doesn't exist");
		}

		Scanner ac = new Scanner(accessFile);
		ac.useDelimiter("\\Z");

		accKey = ac.next();
		return accKey;
	}

	//reading the AWS secretKey from a file
	public String readSecretKey() throws IOException {
		String secKey;
		String secKeyCanonicalPath;

		File secretFile = new File("C:\\Users\\Admin\\Desktop\\Personal_Projects\\Access_keys\\secretKey.txt");

		//validating file path to prevent path traversal vulnerability
		secKeyCanonicalPath = secretFile.getCanonicalPath();
		if(!secKeyCanonicalPath.equals("C:\\Users\\Admin\\Desktop\\Personal_Projects\\Access_keys\\secretKey.txt")){
			System.out.println("Invalid secretKey file: File path is different or the file doesn't exist");
		}

		Scanner sc = new Scanner(secretFile);
		sc.useDelimiter("\\Z");

		secKey = sc.next();
		return secKey;
	}
}