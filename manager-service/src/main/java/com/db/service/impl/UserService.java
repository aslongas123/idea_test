package com.db.service.impl;

import com.db.mapper.UserMapper;
import com.db.pojo.Users;
import com.db.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UsersService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public void addUser(Users users) {
        this.userMapper.insertUser(users);
    }
}
