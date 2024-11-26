package com.example.spring_project_1.myapp.rest;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
    @Value("${firstName.name}")
    private String firstName;

    @Value("${secondName.name}")
    private String secondName;

    @GetMapping("/")
    public String sayHello(){
        return "Hello spring....";
    }

    @GetMapping("/fullname")
    public String getFullName(){
        return "First Name: "+firstName+" Second Name: "+secondName;
    }
}
