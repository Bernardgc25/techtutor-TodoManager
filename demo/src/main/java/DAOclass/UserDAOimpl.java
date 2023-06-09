package DAOclass;

import java.util.Scanner;

import DAOinterface.UserDAO;

import Model.Client;
import Model.Visitor;

public class UserDAOimpl implements UserDAO {
    // User u = new User();
    Client c = new Client();
    Visitor v = new Visitor();

    String firstName, lastName, userName, password, choice;

    Scanner scanner = new Scanner(System.in);

    @Override
    public void register() {

        // throw new UnsupportedOperationException("Unimplemented method 'register'");
        System.out.println("Are you a user(u) or client(c) ? ");
        choice = scanner.nextLine();

        if (choice.equals("v") || choice.equals("V")) {
            System.out.print("Enter firstName: ");
            firstName = scanner.nextLine();
            v.setFirstname(firstName);

            System.out.print("Enter lastName: ");
            lastName = scanner.nextLine();
            v.setLastname(lastName);

            System.out.print("Enter userName: ");
            userName = scanner.nextLine();
            v.setUsername(userName);

            System.out.print("Enter password: ");
            password = scanner.nextLine();
            v.setPassword(password);
        } 
        else if (choice.equals("c") || choice.equals("C")) {
            System.out.print("Enter firstName: ");
            firstName = scanner.nextLine();
            c.setFirstname(firstName);

            System.out.print("Enter lastName: ");
            lastName = scanner.nextLine();
            c.setLastname(lastName);

            System.out.print("Enter userName: ");
            userName = scanner.nextLine();
            c.setUsername(userName);

            System.out.print("Enter password: ");
            password = scanner.nextLine();
            c.setPassword(password);
        }
    }

    @Override
    public void login() {
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

}
