package com.example.demo;

import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import com.example.demo.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private UserService userService;
    @Test
    public void getAllUsersTest(){
        List<User> userList = userService.getAllUsers();
        System.out.println(userList);
    }
    @Test
    public void Test(){

    }
}
