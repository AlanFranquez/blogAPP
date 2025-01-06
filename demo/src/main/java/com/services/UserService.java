package com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.classes.User;
import com.repositories.UserRepo;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }
    
    public User getUser(String username) {
        return userRepository.findByusername(username).orElseThrow(() -> new RuntimeException("User not found"));
    }
}
