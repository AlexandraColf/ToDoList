package com.endava.todolist.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoList {
    @GetMapping("/hello")
    public String hello() {
        return "Hello world";
    }
}
