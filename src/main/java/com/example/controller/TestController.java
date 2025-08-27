package com.example.controller;

import com.example.api.UserHttpApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private UserHttpApi userHttpApi;

    @RequestMapping("/hello")
    public String hello(HttpServletRequest request, HttpServletResponse response,
                        @RequestParam String name, @RequestParam int age) {
        String inName = request.getParameter("name");
        String inAge = request.getParameter("age");

        System.out.println("Name: " + name + ", Age: " + age + ", InName: " + inName + ", InAge: " + inAge);

        return "Hello World!";
    }

    @RequestMapping("/user")
    public String user() {
        String name = "John";
        int age = 25;
        System.out.println(userHttpApi.getUser(name, age));
        return "User";
    }

    @RequestMapping("/addUser")
    public String addUser() {
        String name = "John";
        int age = 25;
        String hometown = "New York";
        userHttpApi.addUser(name, age, hometown);
        return "addUser";
    }
}
