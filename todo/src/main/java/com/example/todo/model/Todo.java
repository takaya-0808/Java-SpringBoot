package com.example.todo.model;

import java.util.Date;

public class Todo {

    private int id;
    private String title;
    private String content;
    private Date createDateTime;
    private Date updateDateTime;
    private Boolean completed;

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

    public Date getCreateDateTime() {
        return this.createDateTime;
    }

    public void setCreateDateTime(Date time) {
        this.createDateTime = time;
    }

    public Date getUpdateDateTime() {
        return this.updateDateTime;
    }

    public void setUpdateDateTime(Date time) {
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