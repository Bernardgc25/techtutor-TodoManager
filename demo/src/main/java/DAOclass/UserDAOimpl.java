package DAOclass;

import java.util.Scanner;

import DAOinterface.UserDAO;

import Model.User;
import Model.Client;
import Model.Vistor;

public class UserDAOimpl implements UserDAO {
    User u = new User(); 
    String firstName,lastName,userName,password;  

    @Override
    public void register() {
        //throw new UnsupportedOperationException("Unimplemented method 'register'");
        
           try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter firstName: ");
            firstName = scanner.nextLine();
            //register.setFirstName(firstName);
            u.setFirstname(firstName);

            System.out.print("Enter lastName: ");
            lastName = scanner.nextLine();
            //register.setLastName(lastName);
            u.setLastname(lastName);

            System.out.print("Enter userName: ");
            userName = scanner.nextLine();
            //register.setUserName(userName);
            u.setUsername(userName);

            System.out.print("Enter password: ");
            password = scanner.nextLine();
            //register.setPassword(password);
            u.setPassword(password);

        
        }
    }
    

    @Override
    public void login() {
        //throw new UnsupportedOperationException("Unimplemented method 'login'");
          try (Scanner scanner = new Scanner(System.in)) {
            System.out.print(" Enter user name: ");
            userName = scanner.nextLine();

            System.out.print(" Enter password: ");
            password = scanner.nextLine();

            /* 
            if ("ramesh".equals(userName) && "password".equals(password)) {
                System.out.println(" User successfully logged-in.. ");
            } else {
                System.out.println(" In valid userName of password ");
            }  
            */
            if(userName.equals(u.getUsername()) && password.equals(u.getPassword())){
                System.out.println("User successfully logged-in..");
            }            
            else{
                System.out.println("Invalid try again");
            }

        }
    
    }
    
}
