package com.blog.demo.classes;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String username;
    private String password;

    @OneToMany
    private List<Post> posts;

    public User() {};

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.posts = new ArrayList<>();
    }

    public Long getId() {
        return this.id;
    }

    public List<Post> getPosts(){
        return this.posts;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

}
