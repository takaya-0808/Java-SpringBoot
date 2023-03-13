package com.example.app.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "todo")
@AllArgsConstructor
@NoArgsConstructor

public class TodoModel {

    @Id
    @SequenceGenerator(name="todo_seq", initialValue=1110, allocationSize=101)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "todo_seq")
    @Column(name="todo_id", updatable=false, nullable=false)
    private long TodoId;

    @NotBlank
    @Size(min=5, message="A Description should have at least 5 characters")
    @Column(name="todo_title")
    private String TodoTitle;

    @NotBlank
    @Sizemin=5, message="A Description should have at least 5 characters")
    @Column(name="todo_description")
    private String TodoDescription;

    @Column(name="is_complete")
    private boolean isComplete;

    @FutureOrPresent
    @Column(name = "todo_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @Temporal(TemporalType.DATE)
    private Date TodoDate;

    @Column(name="creation_date", updatable=false)
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd hh:mm:ss")
    @CreationTimestamp
    private Date creationDate;

    @Column(name="update_date")
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd hh:mm:ss")
    @UpdateTimestamp
    private Date updateDate;

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        this.isComplete = complete;
    }

    public long getTodoID() {
        return TodoId;
    }

    public void setTodoId(long todoid) {
        this.TodoId = todoid;
    }

    public String getTodoTitle() {
        return TodoTitle;
    }

    public void setTodoTitle(String title) {
        this.TodoTitle = title;
    }

    public String getTodoDescription() {
        return TodoDescription;
    }

    public void setTodoDescription(String description) {
        this.TodoDescription = description;
    }

    public Date getTodoDate() {
        return TodoDate;
    }

    public void setTodoDate(Date tododate) {
        this.TodoDate = tododate;
    }

    public Date getCreateDate() {
        return creationDate;
    }

    public void setCreateDate(Date createDate) {
        this.creationDate = createDate
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate
    }
}