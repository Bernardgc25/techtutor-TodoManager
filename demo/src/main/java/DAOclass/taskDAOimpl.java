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

    String disp_Tasks = null;

    Client c = new Client(); 
    Visitor v = new Visitor(); 

    int nooftask;
    char letter = '\0';

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
    public void addtask() {
        //throw new UnsupportedOperationException("Unimplemented method 'addtask'");
            System.out.print("\033[H\033[2J");  
		    System.out.flush();    
            
            int task_id;   
            
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
    public void deletetask() {
        //throw new UnsupportedOperationException("Unimplemented method 'deletetask'");
        System.out.print("\033[H\033[2J");  
		System.out.flush();
        boolean task_delete = true; 
        taskDAOimpl dispTask = new taskDAOimpl();

        while(task_delete){
        //display tasks
            if(!ctasks.isEmpty()){
                //display tasks           
                System.out.println("list of tasks:"); 
                for(int i = 0; i < ctasks.size() ; i++){
                    System.out.println("taskid:" +ctasks.get(i));
                }

                System.out.println("");
                System.out.println("");
                        
                int taskid; 
                System.out.print("Enter taskid to remove: ");
                taskid = scobj.nextInt();
                //delete a task by value 
                ctasks.remove(Integer.valueOf(taskid));

                //clear screen
                System.out.print("\033[H\033[2J");  
		        System.out.flush();    
                //display tasks
                System.out.println("list of tasks:"); 
                for(int i = 0; i < ctasks.size() ; i++){
                    System.out.println("taskid:" +ctasks.get(i));
                }
                
                System.out.println("");
                System.out.println("");
                System.out.print("delete more task (Y/N): ");
                letter = scobj.next().charAt(0);

                //clear screen
                System.out.print("\033[H\033[2J");  
		        System.out.flush();  
                if(letter == 'n' || letter == 'N'){
                    task_delete = false; 
                }
                
                
            }
            else{
                System.out.print("list is empty!! ");
                System.out.print("press (M) go back to menu: ");
                letter = scobj.next().charAt(0);
                    if(letter == 'm' || letter == 'M'){
                        task_delete = false;
                    }
            }
        }
    }

    //search task by client on arraylist
    @Override
    public void searchtask(int taskid) {
        //throw new UnsupportedOperationException("Unimplemented method 'searchtask'");
        System.out.print("\033[H\033[2J");  
		System.out.flush();

        System.out.print("Enter taskid to search: ");
        taskid = scobj.nextInt();
        System.out.println("");
        
        if (ctasks.contains(taskid)){
            System.out.println("taskid exist...");
            System.out.println("");
            //display tasks
            System.out.println("list of tasks:"); 
            for(int i = 0; i < ctasks.size() ; i++){
                System.out.println("taskid:" +ctasks.get(i));
            }
            System.out.println("");
            System.out.print("press (M) go back to menu: ");
            letter = scobj.next().charAt(0);
            if(letter == 'm' || letter == 'M'){
                return; 
            };
        } 
        else {
            System.out.println("taskid do not exist!!!");
            System.out.println("");
            System.out.print("press (M) go back to menu: ");
            letter = scobj.next().charAt(0);
            if(letter == 'm' || letter == 'M'){
                return; 
            };
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
        System.out.print("\033[H\033[2J");  
		System.out.flush();
        
        if(ctasks.isEmpty()){
            System.out.print("list is empty!! ");
                
        }
        else{
            System.out.println("");
            for(int i = 0; i < ctasks.size() ; i++)
            {
                System.out.println("taskid:" +ctasks.get(i));
                //System.out.print(" ");
                //System.out.print(ctasks.get(i));
        
            } 
            
        }
        System.out.println("");
        System.out.println("");
        System.out.print("press (M) go back to menu: ");
        letter = scobj.next().charAt(0);

        System.out.println("");
        if(letter == 'm' || letter == 'M'){
            return; 
        }
        
 
        
    }
    
}
