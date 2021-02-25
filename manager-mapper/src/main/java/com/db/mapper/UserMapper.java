package com.db.mapper;

import com.db.pojo.Users;
import java.util.List;

public interface UserMapper {
     void insertUser(Users user);

     List<Users> selectUserAll();
}
