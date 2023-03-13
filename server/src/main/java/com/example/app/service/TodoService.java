package com.example.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import com.example.app.repository.TodoRepository;
import com.example.app.model.TodoModel;

@Service
public class TodoService {
    
    private static Logger logger = Logger.getLogger(TodoService.class.getName());
    
    @Autowired
    TodoRepository todoRepository;

    // CREATE
    public TodoModel createTodo(TodoModel todo) {
        return todoRepository.save(todo);
    }

    // READ

    // UPDATE

    // DELETE
}