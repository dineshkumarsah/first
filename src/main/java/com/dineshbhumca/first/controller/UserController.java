package com.dineshbhumca.first.controller;

import com.dineshbhumca.first.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.dineshbhumca.first.repositories.UserRepository;


import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping
    public List<User> getUsers(){
        return userRepository.findAll();
    }
    @PostMapping
    public User createUser(@RequestBody User user){
        return userRepository.save(user);
    }

}
