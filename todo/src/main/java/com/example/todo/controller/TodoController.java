package com.example.todo.controller;

import java.util.*;

import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
import com.example.todo.model.Todo;
import com.example.todo.repository.Repository.TodoRepository;

@RestController
@RequestMapping("/todo/api")
public class TodoController {

    @Autowired
    private TodoRepository todoRepository;
    
    @RequestMapping("/")
    String home() {
        return "Hello World";
    }

    @GetMapping(value="/hello")
    public Todo todo() {
        Todo ToDo = new Todo();
        ToDo.setId(1);
        ToDo.setTitle("hoge");
        ToDo.setContent("hoge.hoge.hoge");
        return ToDo;
    }

    @GetMapping(value="/task")
    public String getAllTodoTask() {
        return "hoge";
    }

    @GetMapping("/task/{id}")
    public Todo findById(@PathVariable int id) {
        return todoRepository.findById(id);
    }

    @DeleteMapping(value="/task/{todoId}")
    public String deleteTask(@PathVariable(value="todoId") Long id) {
        return "Task Delete ID" + String.valueOf(id);
    }


}


