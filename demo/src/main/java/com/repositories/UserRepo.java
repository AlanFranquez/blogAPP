package com.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.classes.User;

public interface UserRepo extends JpaRepository<User, Long> {
    Optional<User> findByusername(String username);
}
