package TaskMenu;

import java.util.Scanner;

import DAOclass.taskDAOimpl;


public class taskMenu {
    public taskMenu(){
        /* 
        System.out.print("\033[H\033[2J");  
		System.out.flush();
        */
    }
    
    
    taskDAOimpl task = new taskDAOimpl(); 
    Scanner scanner = new Scanner(System.in);


    public char disp_Clientmenu(char letter, int t_id, int del_tid, int upd_tid) {
        System.out.print("\033[H\033[2J");  
		System.out.flush();

        System.out.println("You are logged in as client..");
        System.out.println("(A) Display assigned tasks");
        System.out.println("(B) Add a task");
        System.out.println("(C) Delete a task");
        System.out.println("(D) Update a task");
        System.out.println("(E) Search a task");
        System.out.println("(X) Exit");
        
        System.out.println("");
        System.out.print("Enter a choice: ");
        letter = scanner.next().charAt(0);

        switch (letter) {
        //display assigned tasks    
        case 'A':
            task.displaytaskVisitor();            
            break;
        case 'a':
            task.displaytaskVisitor();            
            break;
        
        //add a task    
        case 'B':
            task.addtask(t_id);
            break;
        case 'b':
            task.addtask(t_id);
            break;
        
        //delete a task
        case 'C':
            task.deletetask(t_id, del_tid);
            break;
        case 'c':
            task.deletetask(t_id, del_tid);
            break;
        
        //update a task    
        case 'D':
            task.updatetask(t_id, upd_tid);
            break;
        
        case 'd':
            task.updatetask(t_id, upd_tid);
            break;
        
        //search a task    
        case 'E':
            task.searchtask(t_id);
            break;
        
        case 'e':
            task.searchtask(t_id);
            break;

        //exit menu    
        case 'X':
            //task.exitTaskmenu();
            break;
        
        case 'x':
           // task.exitTaskmenu();
            break;    

        }
        return letter;
    
    }

    public char disp_VistorMenu(char letter) {
        System.out.print("\033[H\033[2J");  
		System.out.flush();

        System.out.println("You are logged in as client..");
        
        System.out.println("(A) Display assigned tasks");
        System.out.println("(X) Exit");

        System.out.println("");
        System.out.print("Enter a choice: ");
        letter = scanner.next().charAt(0);
        
        switch (letter) {
        //display assigned tasks    
        case 'A':
            task.displaytaskVisitor();            
            break;
        case 'a':
            task.displaytaskVisitor();
            break;
        case 'X':
            //task.exitTaskmenu();
            break;
        
        case 'x':
           // task.exitTaskmenu();
            break;    
        }
        return letter;
    }

}
