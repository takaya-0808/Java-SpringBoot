package com.example.todo.controller;

import java.util.*;

import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todo/api")
public class TodoController {
    @RequestMapping("/")
    String home() {
        return "Hello World";
    }

}

