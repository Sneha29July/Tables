package com.example.login.LoginAuthentication.controller;

import com.example.login.LoginAuthentication.service.MyEmployeeDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    private MyEmployeeDetailsService myEmployeeDetailsService;
    @GetMapping("/")
    public  String home(){
        return ("<h1>Welcome</h1>");

    }
    @GetMapping("/employee")
    public String employee(){
        return ("<h1>welcome user</h1>");
    }
    @GetMapping("/admin")
    public String admin(){
        return ("<h1>Welcome admin</h1>");
    }

}
