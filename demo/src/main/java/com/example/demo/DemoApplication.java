package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import DAOclass.UserDAOimpl;
//import DAOinterface.UserDAO;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		//System.out.println("hello");

		UserDAOimpl user = new UserDAOimpl();
		
		char choice = '\0';

		user.main(choice);

	}

}
