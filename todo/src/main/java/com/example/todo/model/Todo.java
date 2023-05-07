package com.example.todo.model;

// import java.util.Date;
import java.sql.Timestamp;

public class Todo {

    private int id;
    private String title;
    private String content;
    private Timestamp createDateTime;
    private Timestamp updateDateTime;
    private Boolean completed;

    public Todo() {}

    public Todo(int id, String title, String content, Timestamp createDateTime, Timestamp updateDateTime, Boolean completed) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.createDateTime = createDateTime;
        this.updateDateTime = updateDateTime;
        this.completed = completed;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getCreateDateTime() {
        return this.createDateTime;
    }

    public void setCreateDateTime(Timestamp time) {
        this.createDateTime = time;
    }

    public Timestamp getUpdateDateTime() {
        return this.updateDateTime;
    }

    public void setUpdateDateTime(Timestamp time) {
        this.updateDateTime = time;
    }

    public Boolean getCompleted() {
        return this.completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "Todo List:"
                + "Todo title = " + this.getTitle()
                + "Todo content = " + this.getContent();
    }

    
}