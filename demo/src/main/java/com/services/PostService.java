package com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.classes.*;
import com.repositories.PostRepo;

@Service
public class PostService {
    @Autowired
    private PostRepo repository;


    public Post savePost(Post u) {
        return repository.save(u);
    }

    public List<Post> getAllPost() {
        return repository.findAll();
    }
    
    public List<Post> getPostsByUser(String username) {
        return repository.findPostsByUser(username);
    }
    
}
