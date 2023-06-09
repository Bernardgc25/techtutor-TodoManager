package DAOinterface;

public interface TaskDAO {
    //CRUD functions

    //add new task by client
    public void addtask();

    //update new task by client 
    public void updatetask();

    //delete task by client on arraylist
    public void deletetask();
    
    //search task by client on arraylist
    public void searchtask();

    //assign task by client to visitor 
    public void assigntask();

    //display tasks assigned to visitor 
    public void displaytaskVisitor();

}
