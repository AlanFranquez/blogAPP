package com.classes;


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
    private Byte[] image;
    private long content;

    public Post(String title, Byte[] image, long content) {
        this.title = title;
        this.image = image;
        this.content = content;
    }

    public String getTitle() {
        return this.title;
    }

    public Byte[] image() {
        return this.image;
    }

    public long getContent() {
        return this.content;
    }

}
