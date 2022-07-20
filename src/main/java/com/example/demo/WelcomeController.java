package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class WelcomeController {
 
    @Value("${message}")
    String message;
 
    @GetMapping("/welcome")
    public String getMessage()
    {
        return "Hi "+message;
    }
}