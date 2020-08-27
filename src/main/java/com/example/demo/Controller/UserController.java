package com.example.demo.Controller;

import com.example.demo.Domain.Game;
import com.example.demo.Domain.Type;
import com.example.demo.Domain.User;
import com.example.demo.Repository.UserRepository;
import com.example.demo.Service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    Logger logger = LoggerFactory.getLogger(UserController.class);

    private final UserRepository userRepository;
    private final UserService userService;

    @Autowired
    public UserController(UserRepository userRepository, UserService userService) {
        this.userRepository = userRepository;
        this.userService = userService;
    }

    @PostMapping("/login")
    public User Login(@RequestBody User user) {
        User us = userService.getUser(user.getUsername());
        if (us == null)
            return new User("", "", Type.REGULAR);
        if (us.getPassword().compareTo(user.getPassword()) == 0) {
            return us;
        } else {
            return new User("", "", Type.REGULAR);
        }

    }

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.findAll();
    }

    @PostMapping("/save-user")
    public User saveUser(@RequestBody User user) {
        System.out.println(user);
        return userService.saveUser(user);
    }

    @GetMapping("/get/{id}")
    public User getUser(@PathVariable("id") String id) {
        return userService.getUser(id);
    }

}

