package com.blog.demo.classes;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Post {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;
    private long content;

    public Post() {};

    public Post(String title, Byte[] image, long content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return this.title;
    }


    public long getContent() {
        return this.content;
    }

}
