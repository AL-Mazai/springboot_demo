package com.example.demo.service.impl;

import com.example.demo.mapper.UserMapper;
import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> findByName(String userName) {
        return userMapper.findUserByName(userName);
    }

    public List<User> queryPage(Integer startRows) {
        return userMapper.queryPage(startRows);
    }

    public int getRowCount() {
        return userMapper.getRowCount();
    }

    public User insertUser(User user) {
        userMapper.insertUser(user);
        return user;
    }

    public List<User> ListUser(){
        return userMapper.ListUser();
    }

    public int Update(User user){
        return userMapper.Update(user);
    }

    public int delete(int userId){
        return userMapper.delete(userId);
    }


}
