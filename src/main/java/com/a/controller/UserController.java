package com.a.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.a.domain.Countries;
import com.a.domain.User;
import com.a.service.UserService;


@RestController
@RequestMapping("/users")
public class UserController {


    private UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/list")
    public Iterable<User> list() {
        return userService.list();
    }
    @GetMapping("country/{CountryCode}")
    public List<Object[]> userList (@PathVariable String CountryCode) {
        return userService.user_jean(CountryCode);}
   
}