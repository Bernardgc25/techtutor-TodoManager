package DAOinterface;

import java.util.List;
import java.util.Scanner;

import Model.User;
import Model.Client;
import Model.Vistor;

public interface TaskDAO {
    //CRUD functions

    //add new task 
    public void addtask(User u);

    //update new tasks
    public void updatetask(int taskid);

    //display tasks 
    public List<User> displaytask();

    //delete task on arraylist
    public void deletetask(User u);
    
    //search task from arraylist
    public void searchtask(User u);

    //assign task to visitor 
    public void assigntask(Vistor v);

}
