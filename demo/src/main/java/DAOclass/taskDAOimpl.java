package DAOclass;

import java.util.List;
import java.util.Scanner;

import DAOinterface.TaskDAO;
import Model.Client;
import Model.Visitor;

public class taskDAOimpl implements TaskDAO {
    protected int taskid, taskqty;
    
    public Scanner scobj = new Scanner(System.in);
    public List<Visitor> vtasks;
    public List<Client> ctasks;

    Client c = new Client(); 
    Visitor v = new Visitor();

    public int getTaskid() {
        return taskid;
    }

    public void setTaskid(int taskid) {
        this.taskid = taskid;
    }

    public int getTaskqty() {
        return taskqty;
    }

    public void setTaskqty(int taskqty) {
        this.taskqty = taskqty;
    }

    
    //add new task by client
    @Override
    public void addtask() {
        //throw new UnsupportedOperationException("Unimplemented method 'addtask'");
        ctasks.add(c);
    }

    //update new task by client 
    @Override
    public void updatetask() {
        //throw new UnsupportedOperationException("Unimplemented method 'updatetask'");   
  
        
    }

    //delete task by client on arraylist
    @Override
    public void deletetask() {
        throw new UnsupportedOperationException("Unimplemented method 'deletetask'");
    }

    //search task by client on arraylist
    @Override
    public void searchtask() {
        throw new UnsupportedOperationException("Unimplemented method 'searchtask'");
    }

    //assign task by client to visitor 
    @Override
    public void assigntask() {
        throw new UnsupportedOperationException("Unimplemented method 'assigntask'");
    }

    //display tasks assigned to visitor 
    @Override
    public void displaytaskVisitor() {
        throw new UnsupportedOperationException("Unimplemented method 'displaytaskVisitor'");
    } 

}
