package com.coretutorial.core.controllers;

import com.coretutorial.core.model.User;
import com.coretutorial.core.repositories.UserRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class SomeController {

    private final UserRepository userRepository;

    public SomeController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping("/users")
    public Collection<User> getUserById() {
        return this.userRepository.findAll();
    }
}
