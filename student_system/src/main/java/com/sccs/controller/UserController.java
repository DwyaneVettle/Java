package com.sccs.controller;

import com.sccs.entity.User;
import com.sccs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    private void create(User user) {
        userService.create(user);
    }
}
