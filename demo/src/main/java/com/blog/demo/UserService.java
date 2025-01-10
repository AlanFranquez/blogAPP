package com.blog.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.blog.demo.classes.User;
import com.blog.demo.repositories.UserRepo;

@Service
public class UserService {
    

    private UserRepo userRepository;

    public UserService(UserRepo userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsuarios() {
        return userRepository.findAll();
    } 

    public User newUser(User user) {
        return userRepository.save(user);
    }

    public Optional<User> getUser(String username) {
        return userRepository.findByUsername(username);
    }

    public User getUserById(Long id) {
        return userRepository.findById(id)
                             .orElseThrow(() -> new RuntimeException("User not found"));
    }
}
