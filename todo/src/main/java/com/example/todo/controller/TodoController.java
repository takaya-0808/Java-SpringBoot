package com.example.todo.controller;

import java.util.*;

import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
import com.example.todo.model.Todo;

@RestController
@RequestMapping("/todo/api")
public class TodoController {
    
    @RequestMapping("/")
    String home() {
        return "Hello World";
    }

    @GetMapping(value="/task/{todoId}")
    public String deleteTask(@PathVariable(value="todoId") Long id) {
        return "Task Delete ID" + String.valueOf(id);
    }

    @GetMapping(value="/hello")
    public Todo todo() {
        Todo ToDo = new Todo();
        ToDo.setId(1);
        ToDo.setTitle("hoge");
        ToDo.setContent("hoge.hoge.hoge");
        // ToDo.setCreateDateTime(2022/03/04);
        // ToDo.set
        return ToDo;
    }

    // @GetMapping(value="/task")


}


