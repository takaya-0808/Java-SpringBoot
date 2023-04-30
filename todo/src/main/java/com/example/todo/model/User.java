package com.example.todo.model;


public class User {

    private int userId;
    private int userTodoId;
    private String userName;
    private String userEmail;
    private String userPassWord;


    public User() {}

    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int id) {
        this.userId = userId;
    }

    public int getUserTodoId() {
        return this.userTodoId;
    }

    public void setUserTodoId(int id) {
        this.userTodoId = userTodoId;
    }

}