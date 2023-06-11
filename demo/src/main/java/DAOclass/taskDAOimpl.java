package DAOclass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import DAOinterface.TaskDAO;
import Model.Client;
import Model.Visitor;


public class taskDAOimpl implements TaskDAO {
    //protected int taskid, taskqty;
    
    public Scanner scobj = new Scanner(System.in);
    public List<Integer> vtasks = new ArrayList<Integer>();
    public List<Integer> ctasks = new ArrayList<Integer>(); 

    Client c = new Client(); 
    Visitor v = new Visitor(); 

    int nooftask;

    public taskDAOimpl()
    {
         /* 
        System.out.print("Enter no of tasks to add: ");
        nooftask=scobj.nextInt();
        System.out.print("\n");
        ctasks = new ArrayList<Integer>(nooftask);
        
        //set tasks qty of client 
        c.setTaskqty(nooftask);
        */
    }

    //add new task by client
    @Override
    public void addtask(int task_id) {
        //throw new UnsupportedOperationException("Unimplemented method 'addtask'");
            System.out.print("\033[H\033[2J");  
		    System.out.flush();
            
            //prompt to add new task number
            System.out.print("Enter task number: ");
            task_id = scobj.nextInt();
            ctasks.add(task_id);   
        
        
        
        /* 
        for(int index=0;index<ctasks.size();index++)
        {
            //System.out.print("\033[H\033[2J");  
            //System.out.flush();  
           
            //prompt to add new task number
            System.out.print("Enter task number: ");
            task_id = scobj.nextInt();
            ctasks.add(task_id);   
        } 
        */
    }

    //update new task by client 
    @Override
    public void updatetask(int task_id, int update_task_id) {
        //throw new UnsupportedOperationException("Unimplemented method 'updatetask'");   
 
        System.out.print("Select which task number to update: ");
        task_id = scobj.nextInt();

        System.out.print("Enter a new task number: ");
        task_id = scobj.nextInt();
        
        //replace old task with new task
        ctasks.set(task_id, update_task_id);

        //System.out.println(name + " travelled " + miles + " miles.");
        System.out.print(" taskid "+task_id ); 
        System.out.print(" is now change to taskid "+ update_task_id );
        System.out.print("\n");
    
    }

    //delete task by client on arraylist
    @Override
    public void deletetask(int taskid, int delete_taskid) {
        //throw new UnsupportedOperationException("Unimplemented method 'deletetask'");
        System.out.println("Enter taskid to remove: ");
            taskid = scobj.nextInt();
        
        if (ctasks.contains(taskid)){
            ctasks.remove(taskid);      
            System.out.println("task removed");
            
        }
        else{
            System.out.println("task doesn't exist");
        } 
    }

    //search task by client on arraylist
    @Override
    public void searchtask(int taskid) {
        //throw new UnsupportedOperationException("Unimplemented method 'searchtask'");
        
        if (ctasks.contains(taskid)){
            System.out.println("taskid exist");
        } 
        else {
            System.out.println("taskid do not exist");
        }
    }

    //assign task by client to visitor 
    @Override
    public void assigntask() {
        //throw new UnsupportedOperationException("Unimplemented method 'assigntask'");
        System.out.println("Enter a new task for a visitor: ");
        //taskid = scobj.nextInt();
        v.setTaskid(scobj.nextInt());
    }

    //display tasks assigned to visitor 
    @Override
    public void displaytaskVisitor() {
        //throw new UnsupportedOperationException("Unimplemented method 'displaytaskVisitor'");
        //display tasks before delete
        
        System.out.println("list of tasks:"); 
        for(int i = 0; i < ctasks.size() ; i++)
        {
            System.out.println(ctasks.get(i));
        } 
    
    }

    /* 
    @Override
    public String exitTaskmenu() {
        //throw new UnsupportedOperationException("Unimplemented method 'exitTaskmenu'");
        //System.exit(0);
        
        return "exit"; 
    } 
    */
}
