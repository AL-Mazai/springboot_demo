package com.example.demo.mapper;

import com.example.demo.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    public List<User> findUserByName(String userName);

    public List<User> ListUser();

    public List<User> queryPage(Integer startRows);

    public int getRowCount();

    public int insertUser(User user);

    public int delete(int userId);

    public int Update(User user);
}
