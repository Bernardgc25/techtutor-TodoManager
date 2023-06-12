package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import RegisterMenu.registermenu;
import DAOclass.UserDAOimpl;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		UserDAOimpl usr = new UserDAOimpl(); 
		registermenu rm = new registermenu(); 
		char choice = '\0';
		SpringApplication.run(DemoApplication.class, args);
		//System.out.println("hello");

		Scanner scn = new Scanner(System.in);		
		boolean prog_running = false;
		int choose;

		do {

			//register menu
			System.out.print("\033[H\033[2J");  
			System.out.flush();  
			rm.reg_menu(choice);
			
			System.out.println("Return to main menu? ");
			System.out.println("(1) Continue");
			System.out.println("(0) Quit Program");
			
			//System.out.println();
			System.out.println("");
            System.out.print("Enter a choice: ");
			choose = scn.nextInt();
			if( choose == 1 ) {
				prog_running = true;
			} 
			else if(choose == 0) {
				System.out.println("Thank you...");
				prog_running = false;
			}
		} 
		while(prog_running);
		


		

		
		
	

	}

}
