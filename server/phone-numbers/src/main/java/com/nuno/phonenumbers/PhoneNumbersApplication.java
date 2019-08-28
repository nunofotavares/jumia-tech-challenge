package com.nuno.phonenumbers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nuno.phonenumbers.config.DBConfig;

@SpringBootApplication
public class PhoneNumbersApplication {

	public static void main(String[] args){		
		DBConfig.dbConnect();
		SpringApplication.run(PhoneNumbersApplication.class, args);
	}

	

}