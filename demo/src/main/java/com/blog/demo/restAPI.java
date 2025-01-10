package com.blog.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.handler.UserRoleAuthorizationInterceptor;

import com.blog.demo.classes.User;

@RestController
public class restAPI {

    private UserService userService;

    public restAPI(UserService userService) {
        this.userService = userService;
    }
    
    @GetMapping("/")
    public String helloWorld() {
        return "Hello World ✔️";
    }


    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @GetMapping("/users")
    public List<User> getUsuarios() {
        User u1 = new User("alan", "123");
        User u2 = new User("pedro", "123");
        
        List<User> usuarios = new ArrayList<>();

        usuarios.add(u1);
        usuarios.add(u2);
        return usuarios;
    }

    @PostMapping
    public ResponseEntity<User> crearUsuario(@RequestBody User u) {
        User usr = userService.newUser(u);
        return ResponseEntity.status(HttpStatus.CREATED).body(usr);
    }

}
