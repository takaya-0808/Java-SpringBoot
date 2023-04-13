package com.example.todo.repository;

import java.util.List;
import com.example.todo.model.Todo;


public interface TodoRepository {

    public Todo findById(int id);
    public List<Todo> findAll();
    public int saveTask(Todo todo);
    public int editTask(Todo todo, int id);
    public int deleteTask(int id);
}