package com.example.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.ui.Model;
import com.example.app.model.IndexModel;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// import javax.validation.Valid;
// import java.util.List;
// import java.util.logging.Logger;

import com.example.app.model.TodoModel;
import com.example.app.service.TodoService;

@RestController
@RequestMapping(TodoController.BASE_URL)

public class TodoController {

    public static final String BASE_URL = "/api/v1/todo";
    // private static final Lo

    @Autowired
    TodoService todoService;
    
    @RequestMapping(value="/additem", method=RequestMethod.POST)
    public TodoModel createTodoItem(@RequestBody TodoModel todo) {
        return todoService.createTodo(todo);
    }


    // public ResponseEntity<ResponseTodoList> AddItemToList(@Valid @RequestBody Todo todo) {
    //     long todoId = 0;
    //     todoId = todo
    // }
}