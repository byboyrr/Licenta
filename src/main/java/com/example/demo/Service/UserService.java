package com.example.demo.Service;

import com.example.demo.Domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    User getUser(String id);
    List<User> findAll();
}
