package com.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.classes.Post;

public interface PostRepo extends JpaRepository<Post, Long> {
    List<Post> findPostsByUser(String username); 
}
