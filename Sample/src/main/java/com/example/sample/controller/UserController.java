package com.example.sample.controller;

import com.example.sample.dto.UpdateStatusRequest;
import com.example.sample.dto.UserRequest;
import com.example.sample.model.User;
import com.example.sample.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getAll")
    public LinkedList<User> getUsers() {
        return userService.getUsers();
    }

    @PostMapping("/add")
    public void addUser(@RequestBody @Valid UserRequest request) {
        userService.addUser(request.getUsername(), request.getEmail(), request.getPassword(), request.isStatus());
    }

    @PutMapping("/status")
    public void updateStatus(@RequestBody @Valid UpdateStatusRequest request) {
        userService.updateUserStatus(request.getId(), request.isStatus());
    }

}
