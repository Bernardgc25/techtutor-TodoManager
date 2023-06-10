package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import RegisterMenu.registermenu;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		//System.out.println("hello");
		char choice = '\0';


		//UserDAOimpl user = new UserDAOimpl();		
		//user.main(choice);
		
		registermenu rm = new registermenu(); 

		rm.reg_menu(choice);
		System.out.print("\033[H\033[2J");  
		System.out.flush();  
	
		rm.login_menu(choice);


	}

}
