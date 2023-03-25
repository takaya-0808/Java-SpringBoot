package com.example.todo.model;

import java.util.Date;

public class Todo {

    private int id;
    private String title;
    private String content;
    private Date createDateTime;
    private Date updateDateTime;
    private Boolean archived;
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

    public Boolean getArchived() {
        return this.archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public Boolean getCompleted() {
        return this.completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

}