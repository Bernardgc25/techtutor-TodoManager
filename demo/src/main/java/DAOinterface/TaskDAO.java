package DAOinterface;

import Model.Client;
import Model.Visitor;

public interface TaskDAO {
    //CRUD functions

    //add new task by client
    public void addtask(Client c);

    //update new task by client 
    public void updatetask(Client c);

    //delete task by client on arraylist
    public void deletetask(Client c);
    
    //search task by client on arraylist
    public void searchtask(Client c);

    //assign task by client to visitor 
    public void assigntask(Client c, Visitor v);

    //display tasks assigned to visitor 
    public void displaytaskVisitor(Visitor c);

}
