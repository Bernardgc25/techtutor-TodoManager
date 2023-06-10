package DAOclass;

import java.util.Scanner;

import DAOinterface.UserDAO;

import Model.Client;
import Model.User;
import Model.Visitor;

public class UserDAOimpl implements UserDAO {
    String firstName, lastName; 
    char [] userName;
    char [] password;

    User u = new User(); 

    Scanner scanner = new Scanner(System.in);

    @Override
    public void main(char choice) {
    UserDAOimpl m = new UserDAOimpl(); 

        //throw new UnsupportedOperationException("Unimplemented method 'main'");
        System.out.print("Press (r) to register, if you have an account (l) to login ");
        choice = scanner.next().charAt(0);

        if (choice == 'r' || choice == 'R') {
            m.register(choice);
        }
        else if (choice == 'l' || choice == 'L'){
            m.Client_login();
        }       
    }

    

    @Override
    public void register(char choice) {

        //throw new UnsupportedOperationException("Unimplemented method 'register'");
        System.out.print("Are you a client(c) or visitor(v) ? ");
        choice = scanner.next().charAt(0);

        //Client account
        if (choice == 'c' || choice == 'C') {
           
            System.out.print("Enter firstName: ");
            firstName = scanner.next();
            scanner.nextLine();

            u.setFirstname(firstName);

            System.out.print("Enter lastName: ");
            lastName = scanner.next();
            u.setLastname(lastName);
            scanner.nextLine();
            
            System.out.print("Enter userName: ");
            userName = scanner.next().toCharArray();
            u.setUsername(userName);
            scanner.nextLine();
            

            System.out.print("Enter password: ");
            password = scanner.next().toCharArray();
            u.setPassword(password);
            scanner.nextLine();
            

            //create new visitor account
            Client c = new Client(u.getFirstname(), u.getLastname(), u.getUsername(), u.getPassword());
            //System.out.println(c);
            
            //display sername and password
            System.out.println("you have succesfully register a client account");
            System.out.print("USERNAME is: ");
            for (char un:userName) {  
            System.out.print(un);  
            } 
            
            System.out.print("\n");
            System.out.print("PASSWORD is: ");
            for (char pwd:password) {  
            System.out.print(pwd);  
            } 
            System.out.print("\n");


        } 
        //client account
        else if (choice == 'v' || choice == 'V') {
            System.out.print("Enter firstName: ");
            firstName = scanner.next();
            scanner.nextLine();

            u.setFirstname(firstName);

            System.out.print("Enter lastName: ");
            lastName = scanner.next();
            u.setLastname(lastName);
            scanner.nextLine();
            
            System.out.print("Enter userName: ");
            userName = scanner.next().toCharArray();
            u.setUsername(userName);
            scanner.nextLine();
            

            System.out.print("Enter password: ");
            password = scanner.next().toCharArray();
            u.setPassword(password);
            scanner.nextLine();
            

            //create new client account
            Visitor v = new Visitor(u.getFirstname(), u.getLastname(), u.getUsername(), u.getPassword());
            //System.out.println(v);
            
            //display sername and password
            System.out.println("you have succesfully register a visitor account");
            
            System.out.print("USERNAME is: ");
            for (char un:userName) {  
            System.out.print(un);  
            } 
            
            System.out.print("\n");
            System.out.print("PASSWORD is: ");
            for (char pwd:password) {  
            System.out.print(pwd);  
            } 
           
            System.out.print("\n");
           
        }
    }

    @Override
    public void Client_login() {
        Client c = new Client();
        // throw new UnsupportedOperationException("Unimplemented method 'login'");
        System.out.println(" Enter user name: ");
        userName = scanner.next().toCharArray();

        System.out.println(" Enter password: ");
        password = scanner.next().toCharArray();

        if(userName.equals(c.getUsername()) && password.equals(c.getPassword())){
            System.out.println("User successfully logged-in..");
        }            
        else{
            System.out.println("Invalid try again");
        }

    }

    @Override
    public void Visitor_login() {
        //throw new UnsupportedOperationException("Unimplemented method 'Visitor_login'");

        /* 
        Visitor v = new Visitor();
        // throw new UnsupportedOperationException("Unimplemented method 'login'");

        System.out.println(" Enter user name: ");
        userName = scanner.nextLine();

        System.out.println(" Enter password: ");
        password = scanner.nextLine();

        if(userName.equals(v.getUsername()) && password.equals(v.getPassword())){
            System.out.println("User successfully logged-in..");
        }            
        else{
            System.out.println("Invalid try again");
        }
        */
    }

  
}
