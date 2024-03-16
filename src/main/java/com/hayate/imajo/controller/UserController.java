package com.hayate.imajo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.hayate.imajo.entity.User;
import com.hayate.imajo.service.UserService;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String showRegistrationForm(@ModelAttribute("user") User user) {

        return "register";
    }

    @PostMapping("/register")
    public String registserUser(@ModelAttribute("user") User user) {
        userService.registerUser(user);
        return "redirect:/login";
    }

}
