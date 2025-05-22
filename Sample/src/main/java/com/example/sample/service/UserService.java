package com.example.sample.service;

import com.example.sample.exception.UserAlreadyExistsExceptions;
import com.example.sample.exception.UserNotFoundException;
import com.example.sample.model.User;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Service
public class UserService {
    @Getter
    private final LinkedList<User> users = new LinkedList<>();
    private long nextId = 1;

    public void addUser(String username, String email, String password, boolean status){
        throw new RuntimeException("Not implemented");
//        boolean exist = users.stream().anyMatch(user -> user.getEmail().equalsIgnoreCase(email));
//        if (exist) throw new UserAlreadyExistsExceptions();
//
//        users.add(new User(nextId++, username, email, password, status));
    }

    public void updateUserStatus(Long id, boolean status){
        User user = users.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst()
                .orElseThrow(UserNotFoundException::new);

        user.setStatus(status);
    }
}

