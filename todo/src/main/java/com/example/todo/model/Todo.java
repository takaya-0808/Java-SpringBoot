package com.example.todo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer ID;

    @Column(nullable=false, length=50)
    private String title;

    @Column(nullable=false, length=500)
    private String content;

    @Column(nullable=false)
    @Temporal(value=Temporal.TIMESTAMP)
    private Date createdDateTime;

}