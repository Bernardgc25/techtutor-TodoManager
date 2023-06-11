package DAOclass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import DAOinterface.UserDAO;

import Model.Client;
import Model.User;
import Model.Visitor;
import TaskMenu.taskMenu;

public class UserDAOimpl implements UserDAO {

    
    //for initialize
    String firstName, lastName; 
    char[] userName, password, un, pwd;

    char letter = '\0'; 
    int t_id = 0;
    int del_tid = 0;
    int upd_tid = 0;

    taskMenu tm = new taskMenu();
    boolean flag = true;
    char cMenu = '\0';
    char vMenu = '\0';



    //for retrieving
    //char[] uN, uP;

    //list of clients
    public List<Client> clients_list = new ArrayList<Client>();
    //list of visitors 
    public List<Visitor> visitors_list = new ArrayList<Visitor>();;
    
    User u = new User(); 
    taskDAOimpl exitM = new taskDAOimpl(); 

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


        System.out.println("(C) register as a client");
        System.out.println("(V) register as a visitor");

        System.out.println("");
        System.out.print("Enter your option: ");
        //System.out.print("Are you a client(c) or visitor(v) ? ");
        choice = scanner.next().charAt(0);

        System.out.print("\033[H\033[2J");  
		System.out.flush();  

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
            
            //create new client account
            Client c = new Client(u.getFirstname(), u.getLastname(), u.getUsername(), u.getPassword());
            //System.out.println(c);
            //create new visitor account
            //add object to arraylist
            clients_list.add(c);

            System.out.print("\033[H\033[2J");  
		    System.out.flush();
            //display info
            System.out.println("you have succesfully register a client account");
            //System.out.print("\n");
            
            /*  
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
            */
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
            
            System.out.print("\033[H\033[2J");  
		    System.out.flush();
            //display info
            System.out.println("you have succesfully register a visitor account");
            //System.out.print("\n");
            /* 
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
            */             
        }
    }

    @Override
    public void Client_login() {
        // throw new UnsupportedOperationException("Unimplemented method 'login'");
        Client c = new Client();
       
        System.out.print("Enter username: ");
        un = scanner.next().toCharArray();
        scanner.nextLine();

        System.out.print("Enter password: ");
        pwd= scanner.next().toCharArray();
        scanner.nextLine();

        System.out.print("\033[H\033[2J");  
		System.out.flush();

        /* 
        System.out.println("You are logged in as client..");

        //System.out.println("User successfully logged-in..");
        for(int i=0;i<clients_list.size();i++){
            if((clients_list.get(i).getUsername().equals(un) )&& (clients_list.get(i).getPassword().equals(pwd))){
                System.out.println("User successfully logged-in..");
            }
            else{
                System.out.println("No records, Invalid try again");    
            }
        }
        */
  
        //display client task menu  
        //keep repeating until user decide to stop 
        while(true){
            cMenu = tm.disp_Clientmenu(letter, t_id, del_tid, upd_tid);

            if (cMenu == 'x' || cMenu == 'X'){
                break;
            }
        }

}



    @Override
    public void Visitor_login() {
        //throw new UnsupportedOperationException("Unimplemented method 'Visitor_login'");
        Visitor v = new Visitor();

        System.out.print("Enter username: ");
        un = scanner.next().toCharArray();
        scanner.nextLine();

        System.out.print("Enter password: ");
        pwd= scanner.next().toCharArray();
        scanner.nextLine();

        /* 
        System.out.println("You are logged in as Visitor..");
        //System.out.println("User successfully logged-in..");
        for(int i=0;i<visitors_list.size();i++){
            if((visitors_list.get(i).getUsername().equals(un) )&& (visitors_list.get(i).getPassword().equals(pwd))){
                System.out.println("User successfully logged-in..");
            }
            else{
                System.out.println("No records, Invalid try again");    
            }
        }    
        */

        //display client task menu  
        //keep repeating until user decide to stop 
        while(true){
            //cMenu = tm.disp_Clientmenu(letter, t_id, del_tid, upd_tid);
            vMenu = tm.disp_VistorMenu(letter);
            if (vMenu == 'x' || vMenu == 'X'){
                break;
            }
        }

    }

}
