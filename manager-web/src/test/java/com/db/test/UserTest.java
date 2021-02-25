package com.db.test;

import com.db.mapper.UserMapper;
import com.db.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class UserTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void insertUser(){
        Users user = new Users();
        user.setUsername("张三");
        user.setUserAge(12);
        this.userMapper.insertUser(user);
    }
}
