package com.blog.demo.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.demo.classes.User;

public interface UserRepo extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);
}
