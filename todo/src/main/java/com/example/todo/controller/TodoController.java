package com.example.todo.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
import com.example.todo.model.Todo;
import com.example.todo.repository.TodoRepository;

@RestController
@RequestMapping("/todo/api")
public class TodoController {

    @Autowired
    private TodoRepository todoRepository;
    
    @RequestMapping("/")
    String home() {
        return "Hello World";
    }

    @GetMapping("/task")
    public List<Todo> getAllTask() {
        return todoRepository.findAll();
    }

    // todoタスクを追加
    @PostMapping("/task")
    public int createTask(@RequestBody Todo todo) {
        return todoRepository.saveTask(todo);
    }

    // 全てのタスクを取得する
    @GetMapping("/task/{id}")
    public Todo getOneTask(@PathVariable int id) {
        return todoRepository.findById(id);
    }

    // 特定のタスクを削除
    @DeleteMapping("/task/{id}")
    public String deleteTask(@PathVariable Long id) {
        return "Task Delete ID" + String.valueOf(id);
    }


}


