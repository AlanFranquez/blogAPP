package com.blog.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.classes.User;


@RestController
public class rest {
    @GetMapping("/")
    public Map<Integer, User> getMethodName() {

        User u1 = new User("alan", "213123123");
        User u2 = new User("pedro", "123");


        Map<Integer, User> hash = new HashMap<>();

        hash.put(12313, u1);
        hash.put(1123, u2);

        return hash;
    
    }   
    
}
