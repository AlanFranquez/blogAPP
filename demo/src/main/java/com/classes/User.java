package com.classes;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private String username;
    private long password;
    private List<Post> posts;

    public User(String username, long password) {
        this.username = username;
        this.password = password;
        this.posts = new ArrayList<>();
    }

    public long getId() {
        return this.id;
    }

    public List<Post> getPosts(){
        return this.posts;
    }

    public String getUsername() {
        return this.username;
    }

    public long getPassword() {
        return this.password;
    }

}
