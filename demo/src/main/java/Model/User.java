package Model; 
//package com.example.demo;


public class User {
    protected String firstname, lastname;
    char[] username, password;

    protected int taskid, taskqty;


    public User(){

    }
    
    public User(String fname, String lname, char[] uname, char[] pwd){
        this.firstname = fname; 
        this.lastname = lname; 
        this.username = uname; 
        this.password = pwd; 

    }

    public char[] getUsername() {
        return username;
    }

    public void setUsername(char[] username) {
        this.username = username;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }



    public int getTaskqty() {
        return taskqty;
    }

    public void setTaskqty(int taskqty) {
        this.taskqty = taskqty;
    }

    public int getTaskid() {
        return taskid;
    }

    public void setTaskid(int taskid) {
        this.taskid = taskid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    

}
