package com.example.LibraryManagement.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class LibraryManagement {

    @GetMapping("/greeting")
    public String getGreeting() {
        return "Hello, Library Management!";
    }
    
}