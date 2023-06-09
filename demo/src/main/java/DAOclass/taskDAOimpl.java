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
    public List<Visitor> vtasks = new ArrayList<Visitor>();
    public List<Client> ctasks = new ArrayList<Client>();;

    Client c = new Client(); 
    Visitor v = new Visitor();

    
    //add new task by client
    @Override
    public void addtask() {
        //throw new UnsupportedOperationException("Unimplemented method 'addtask'");
        ctasks.add(c);
    }

    //update new task by client 
    @Override
    public void updatetask(int taskid) {
        //throw new UnsupportedOperationException("Unimplemented method 'updatetask'");   
        for(Client cl:ctasks)
		    {
			    if(cl.getTaskid() == taskid)
			    {
				    System.out.println("Enter new task quantity");
                    cl.setTaskid(scobj.nextInt());
                }
		    }
        
    }

    //delete task by client on arraylist
    @Override
    public void deletetask(int taskid) {
        //throw new UnsupportedOperationException("Unimplemented method 'deletetask'");
        System.out.println("Enter taskid to remove: ");
            taskid = scobj.nextInt();
        
        if (ctasks.contains(c)){
            ctasks.remove(taskid);      
            System.out.println("task removed");
            
        }
        else{
            System.out.println("task doesn't exist");
        } 
  
    }

    //search task by client on arraylist
    @Override
    public void searchtask() {
        //throw new UnsupportedOperationException("Unimplemented method 'searchtask'");
        if (ctasks.contains(c)){
            System.out.println("Found the task");
        } 
        else {
            System.out.println("There is no such task");
        }
    }

    //assign task by client to visitor 
    @Override
    public void assigntask() {
        throw new UnsupportedOperationException("Unimplemented method 'assigntask'");
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

}
