package com.a.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public Iterable<User>  getUser(@PathVariable String CountryCode) {
    	if(CountryCode.toUpperCase().equals(CountryCode) && CountryCode.length()==2)
    	{
    	return userService.list();
    	}else {
    		return null;
    	}
    }
   
}