package com.framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoginSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginSampleApplication.class, args);
		System.out.println("Hello, login sample");
	}

}
