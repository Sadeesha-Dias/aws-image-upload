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
	public String readAccessKey() throws FileNotFoundException {
		String accKey;

		File accessFile = new File("C:\\Users\\Admin\\Desktop\\Personal_Projects\\Access_keys\\accessKey.txt");
		Scanner ac = new Scanner(accessFile);
		ac.useDelimiter("\\Z");

		accKey = ac.next();
		return accKey;
	}

	//reading the AWS secretKey from a file
	public String readSecretKey() throws FileNotFoundException {
		String secKey;

		File secretFile = new File("C:\\Users\\Admin\\Desktop\\Personal_Projects\\Access_keys\\secretKey.txt");
		Scanner sc = new Scanner(secretFile);
		sc.useDelimiter("\\Z");

		secKey = sc.next();
		return secKey;
	}

}
