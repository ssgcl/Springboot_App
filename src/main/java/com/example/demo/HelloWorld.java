package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Initializing springboot app
@SpringBootApplication
//Initializing RESTful services
@RestController
public class HelloWorld {
    //Initializing endpoint	
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }
}