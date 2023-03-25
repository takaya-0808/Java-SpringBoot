package com.example.todo.model;

import java.util.Date;

public class Todo {

    private Long id;
    private String title;
    private String content;
    private Date createDateTime;
    private Date updateDateTime;
    private Boolean archived;
    private Boolean completed;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateDateTime() {}

    public void setreateDateTime(Date time) {}

    public Date getUpdateDateTime() {}

    public void setUpdateDateTime(Date time) {}

    public Boolean getArchived() {}

    public void setArchived(Boolean archived) {}

    public Boolean getCompleted() {}

    public void setCompleted(Boolean completed) {}

}