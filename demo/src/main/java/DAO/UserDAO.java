
package DAO;

import java.util.*;

import Model.User;
import Model.Client;
import Model.Vistor;



public class UserDAO {
    public List<User> utaskdao;
	public Scanner scobj;
	public UserDAO()
	{
		scobj=new Scanner(System.in);
		utaskdao = new ArrayList<User>();
	}

    //add new task 
    public void addtask(User u) {
        utaskdao.add(u);
    }

    //update new tasks
    public void updatetask(int taskid) {
        for(User u:utaskdao)
		{
			if(u.getTaskid() == taskid)
			{
				System.out.println("Enter new task quantity");
				u.setTaskid(scobj.nextInt());
			}
		}
    }

    //display tasks 
    public List<User> displaytask() {
        return utaskdao;
    }

    //delete task on arraylist
    public void deletetask(User u){
        utaskdao.remove(u);
    }
    
    //search task from arraylist
    public void searchtask(User u){
        if (utaskdao.contains(u)) {
            System.out.println("Found the task");
        } 
        else {
            System.out.println("There is no such task");
        }
    }

    //assign task to visitor 
    public void assigntask(Vistor v) {
        
    }

    public void register() {
        
    }

    public void login(){

    }
}
