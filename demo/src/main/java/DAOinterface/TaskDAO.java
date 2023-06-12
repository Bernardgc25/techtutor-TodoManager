package DAOinterface;



public interface TaskDAO {
    //CRUD functions

    //add new task by client
    public void addtask();

    //update new task by client 
    public void updatetask(int task_id, int update_task_id);

    //delete task by client on arraylist
    public void removetask();
    
    //search task by client on arraylist
    public void searchtask(int taskid);

    //assign task by client to visitor 
    public void assigntask();

    //display tasks assigned to visitor 
    public void displaytaskVisitor();



}
