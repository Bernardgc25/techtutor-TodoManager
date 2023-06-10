package DAOclass;

import java.util.Scanner;

import DAOinterface.UserDAO;

import Model.Client;
import Model.User;
import Model.Visitor;

public class UserDAOimpl implements UserDAO {
    // User u = new User();
  

    String firstName, lastName, userName, password, choice;
    int task; 
    
    User u = new User(); 
    //Client c = new Client();
    //Visitor v = new Visitor();

    Scanner scanner = new Scanner(System.in);

    @Override
    public void register() {

        // throw new UnsupportedOperationException("Unimplemented method 'register'");
        System.out.println("Are you a user(u) or client(c) ? ");
        choice = scanner.nextLine();

        //visitor account
        if (choice.equals("v") || choice.equals("V")) {
            System.out.print("Enter firstName: ");
            firstName = scanner.nextLine();
            u.setFirstname(firstName);

            System.out.print("Enter lastName: ");
            lastName = scanner.nextLine();
            u.setLastname(lastName);

            System.out.print("Enter userName: ");
            userName = scanner.nextLine();
            u.setUsername(userName);

            System.out.print("Enter password: ");
            password = scanner.nextLine();
            u.setPassword(password);
            
            //create new visitor
            Visitor v = new Visitor(u.getFirstname(), u.getLastname(), u.getUsername(), u.getPassword());
            System.out.println(v);
        } 
        //client account
        else if (choice.equals("c") || choice.equals("C")) {
            System.out.print("Enter firstName: ");
            firstName = scanner.nextLine();
            u.setFirstname(firstName);

            System.out.print("Enter lastName: ");
            lastName = scanner.nextLine();
            u.setLastname(lastName);

            System.out.print("Enter userName: ");
            userName = scanner.nextLine();
            u.setUsername(userName);

            System.out.print("Enter password: ");
            password = scanner.nextLine();
            u.setPassword(password);

            //create new client account
            Client c = new Client(u.getFirstname(), u.getLastname(), u.getUsername(), u.getPassword());
            System.out.println(c);
        }
    }

    @Override
    public void Client_login() {
        Client c = new Client();
        // throw new UnsupportedOperationException("Unimplemented method 'login'");
        System.out.print(" Enter user name: ");
        userName = scanner.nextLine();

        System.out.print(" Enter password: ");
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
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'Visitor_login'");
        Visitor v = new Visitor();
        // throw new UnsupportedOperationException("Unimplemented method 'login'");
        System.out.print(" Enter user name: ");
        userName = scanner.nextLine();

        System.out.print(" Enter password: ");
        password = scanner.nextLine();

        if(userName.equals(v.getUsername()) && password.equals(v.getPassword())){
            System.out.println("User successfully logged-in..");
        }            
        else{
            System.out.println("Invalid try again");
        }

    }

}
