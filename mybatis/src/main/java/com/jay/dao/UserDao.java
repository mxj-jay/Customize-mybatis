package com.jay.dao;

import com.jay.domain.User;
import com.jay.mybatis.annotation.Select;

import java.util.List;

public interface UserDao {

    @Select("select * from user")
    List<User> findAll();

}
