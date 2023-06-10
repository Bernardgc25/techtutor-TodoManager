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
}
