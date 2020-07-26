package com.example.demo.Service;

import com.example.demo.Domain.User;

public interface UserService {
    User saveUser(User user);
    User getUser(String id);
}
