package DAOclass;

import java.util.Scanner;

import DAOinterface.UserDAO;

import Model.Client;
import Model.User;
import Model.Visitor;

public class UserDAOimpl implements UserDAO {
    String firstName, lastName, userName, password, choice;
    User u = new User(); 

    Scanner scanner = new Scanner(System.in);

    @Override
    public void main(char choice) {
    UserDAOimpl m = new UserDAOimpl(); 

        //throw new UnsupportedOperationException("Unimplemented method 'main'");
        System.out.println("Press (r) to register, if you have an account (l) to login ");
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
        System.out.println("Are you a user(u) or client(c) ? ");
        choice = scanner.next().charAt(0);

        //visitor account
        if (choice == 'v' || choice == 'V') {
            System.out.println("Enter firstName: ");
            firstName = scanner.nextLine();
            u.setFirstname(firstName);

            System.out.println("Enter lastName: ");
            lastName = scanner.nextLine();
            u.setLastname(lastName);

            /* 
            System.out.println("Enter userName: ");
            userName = scanner.nextLine();
            u.setUsername(userName);

            System.out.println("Enter password: ");
            password = scanner.nextLine();
            u.setPassword(password);
            
            //create new visitor
            Visitor v = new Visitor(u.getFirstname(), u.getLastname(), u.getUsername(), u.getPassword());
            System.out.println(v);
            */
        } 
        //client account
        else if (choice == 'c' || choice == 'C') {
            System.out.println("Enter firstName: ");
            firstName = scanner.nextLine();
            u.setFirstname(firstName);

            System.out.println("Enter lastName: ");
            lastName = scanner.nextLine();
            u.setLastname(lastName);

            /*     
            System.out.println("Enter userName: ");
            userName = scanner.nextLine();
            u.setUsername(userName);

            System.out.println("Enter password: ");
            password = scanner.nextLine();
            u.setPassword(password);

            //create new client account
            Client c = new Client(u.getFirstname(), u.getLastname(), u.getUsername(), u.getPassword());
            System.out.println(c);
            */
        }
    }

    @Override
    public void Client_login() {
        Client c = new Client();
        // throw new UnsupportedOperationException("Unimplemented method 'login'");
        System.out.println(" Enter user name: ");
        userName = scanner.nextLine();

        System.out.println(" Enter password: ");
        password = scanner.nextLine();

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
