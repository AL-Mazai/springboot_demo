package com.example.demo.pojo;

import lombok.Data;
import org.springframework.stereotype.Repository;

@Data
public class User {
    private int userId;
    private String userName;
}
