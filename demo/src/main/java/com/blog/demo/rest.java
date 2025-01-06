package com.blog.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class rest {
    @GetMapping("/")
    public List<ResponseEntity> getMethodName() {
        
        List newList = new ArrayList<ResponseEntity>();

        newList.add(ResponseEntity.ok("Test"));
        newList.add(ResponseEntity.ok("Test"));
        newList.add(ResponseEntity.ok("Test"));
        newList.add(ResponseEntity.ok("Test"));
        return newList;
    }
    
}
