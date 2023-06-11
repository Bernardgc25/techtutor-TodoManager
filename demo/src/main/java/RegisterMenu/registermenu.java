package RegisterMenu;

import DAOclass.UserDAOimpl;

import java.util.Scanner;

public class registermenu {
    Scanner scanner = new Scanner(System.in);
    
    public void reg_menu(char letter){
        UserDAOimpl m = new UserDAOimpl(); 
        
        System.out.println("(R) Register");
        System.out.println("(L) Login");

        System.out.println("");
        System.out.print("Enter a choice: ");
        letter = scanner.next().charAt(0);

        System.out.print("\033[H\033[2J");  
		System.out.flush();  
        
        
        switch (letter) {
        //register    
        case 'r':
            m.register(letter);          
            break;
        case 'R':
            m.register(letter);          
            break;
        
        //login
        case 'l':
            m.Client_login();
            break;
        case 'L':
            m.Client_login();
            break;
        }

    }

      public void login_menu(char letter){
        UserDAOimpl l = new UserDAOimpl(); 
        
        System.out.println("");
        System.out.println("Log-in account");
        System.out.println("(C) Client");
        System.out.println("(V) Visitor");

        System.out.println("");
        System.out.print("Enter a choice: ");
        letter = scanner.next().charAt(0);

        System.out.print("\033[H\033[2J");  
		System.out.flush();  
        
        switch (letter) {
        //login as client 
        case 'c':
            l.Client_login();  
            break;
        case 'C':
            l.Client_login();  
            break;
        
        //login as visitor
        case 'v':
          
            break;
        case 'V':
         
            break;
        }

    }

}
