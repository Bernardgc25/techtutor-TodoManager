package Model; 
//package com.example.demo;


public class User {
    protected String firstname, lastname, username, password;
    protected int taskid, taskqty;

  
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
