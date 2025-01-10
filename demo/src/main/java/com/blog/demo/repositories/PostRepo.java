package com.blog.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.demo.classes.Post;

public interface PostRepo extends JpaRepository<Post, Long> {
  
}
