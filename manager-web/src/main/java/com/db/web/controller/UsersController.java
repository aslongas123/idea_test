package com.db.web.controller;

import com.db.pojo.Users;
import com.db.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UsersController {
    @Autowired
    private UsersService userService;

    @RequestMapping("/addUser")
    public String addUser(Users users){
        this.userService.addUser(users);
        return "ok";
    }
}
