package com.example.demo.controller;

import com.example.demo.mapper.UserMapper;
import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
//@ResponseBody
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/get")
    public String getAllUser(){
        List<User> userList = userService.getAllUsers();
        System.out.println(userList);
        return "hello";
    }

}
