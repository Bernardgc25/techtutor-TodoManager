package DAOinterface;

import java.util.ArrayList;

import Model.Client;

public interface TaskDAO {
    //CRUD functions

    //add new task by client
    public void addtask();

    //update new task by client 
    public void updatetask(int taskid);

    //delete task by client on arraylist
    public void deletetask(int taskid);
    
    //search task by client on arraylist
    public void searchtask(int taskid);

    //assign task by client to visitor 
    public void assigntask();

    //display tasks assigned to visitor 
    public void displaytaskVisitor();

}
