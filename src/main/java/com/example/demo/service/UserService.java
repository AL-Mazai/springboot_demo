package com.example.demo.service;

import com.example.demo.pojo.User;

import java.util.List;

public interface UserService {
    public List<User> findByName(String userName);

    public List<User> queryPage(Integer startRows);

    public int getRowCount();

    public User insertUser(User user);

    public List<User> ListUser();

    public int Update(User user);

    public int delete(int userId);

}
