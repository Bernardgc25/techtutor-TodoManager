package DAOclass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import DAOinterface.UserDAO;

import Model.Client;
import Model.User;
import Model.Visitor;

public class UserDAOimpl implements UserDAO {

    
    //for initialize
    String firstName, lastName; 
    char[] userName, password;

    //for retrieving
    //char[] uN, uP;

    //list of clients
    public List<Client> clients_list = new ArrayList<Client>();
    //list of visitors 
    public List<Visitor> visitors_list = new ArrayList<Visitor>();;
    
    User u = new User(); 

    Scanner scanner = new Scanner(System.in);

    //constructor 
    public UserDAOimpl(){

    }
    
    /* 
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
    */
    

    @Override
    public void register(char choice) {

        //throw new UnsupportedOperationException("Unimplemented method 'register'");
        System.out.print("Are you a client(c) or visitor(v) ? ");
        choice = scanner.next().charAt(0);

        //Client account
        if (choice == 'c' || choice == 'C') {
            //save input into variable including spaces 
            scanner.nextLine(); 
            System.out.print("Enter firstName: ");
            firstName = scanner.nextLine();
            u.setFirstname(firstName);
            //scanner.nextLine(); 

            System.out.print("Enter lastName: ");
            lastName = scanner.nextLine();
            u.setLastname(lastName);
            
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
            //create new visitor account
            //add object to arraylist
            clients_list.add(c);

            //display info
            System.out.println("you have succesfully register a client account");
            System.out.println("\n");
            for(int i=0;i<clients_list.size();i++){
                System.out.print("FIRST NAME is: ");
                System.out.println(clients_list.get(i).getFirstname());
                System.out.print("LAST NAME is: ");
                System.out.println(clients_list.get(i).getLastname());
                System.out.print("USERNAME is: ");
                System.out.println(clients_list.get(i).getUsername());
                System.out.print("PASSWORD is: ");
                System.out.println(clients_list.get(i).getPassword());      
            }       
            
        } 
        //visitor account
        else if (choice == 'v' || choice == 'V') {
            //save input into variable including spaces 
            scanner.nextLine(); 
            System.out.print("Enter firstName: ");
            firstName = scanner.nextLine();
            u.setFirstname(firstName);
            //scanner.nextLine(); 

            System.out.print("Enter lastName: ");
            lastName = scanner.nextLine();
            u.setLastname(lastName);
            
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
            //add object to arraylist
            visitors_list.add(v);
            
            //display info
            
            System.out.println("\n");
            for(int i=0;i<clients_list.size();i++){
                System.out.print("FIRST NAME is: ");
                System.out.println(clients_list.get(i).getFirstname());
                System.out.print("LAST NAME is: ");
                System.out.println(clients_list.get(i).getLastname());
                System.out.print("USERNAME is: ");
                System.out.println(clients_list.get(i).getUsername());
                System.out.print("PASSWORD is: ");
                System.out.println(clients_list.get(i).getPassword());      
            }                
        }
    }

    @Override
    public void Client_login() {

        
        Client cu = new Client();
        Client cp = new Client();

        // throw new UnsupportedOperationException("Unimplemented method 'login'");

        System.out.print("Enter username: ");
        userName = scanner.next().toCharArray();
        scanner.nextLine();

        System.out.print("Enter password: ");
        password = scanner.next().toCharArray();
        scanner.nextLine();

        /* 
        UserDAOimpl clientUN = new UserDAOimpl(); 
        UserDAOimpl clientPWD = new UserDAOimpl(); 
        
        cu = clientUN.find_ClientUsername(userName);
        cp = clientPWD.find_ClientPassword(password);

        System.out.print("USERNAME is: ");
        System.out.println(cu);
        
        System.out.print("PASSWORD is: ");
        System.out.println(cp);
        */
        
        
        /* 
        if(userName.equals(c.getUsername()) && password.equals(c.getPassword())){
            System.out.println("User successfully logged-in..");
        }            
        else{
            System.out.println("No records, Invalid try again");       
        }
        */
        
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

    public Client find_ClientUsername(char[] uN){
        
        //retrive a password
        for (Client cl : clients_list) {
            if (cl.getUsername().equals(uN)) {
            return cl;
            }
        }
        return null;
    }

    public Client find_ClientPassword(char[] uP){
        
        //retrive a password
        for (Client cl : clients_list) {
            if (cl.getPassword().equals(password)) {
            return cl;
            }
        }
        return null;
    }



  
}
