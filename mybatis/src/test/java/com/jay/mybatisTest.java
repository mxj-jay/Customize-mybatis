package com.jay;

import com.jay.dao.UserDao;
import com.jay.domain.User;
import com.jay.mybatis.io.Resources;
import com.jay.mybatis.sqlSession.SqlSession;
import com.jay.mybatis.sqlSession.SqlSessionFactory;
import com.jay.mybatis.sqlSession.SqlSessionFactoryBuilder;
import com.jay.mybatis.sqlSession.SqlSession;


import java.io.InputStream;
import java.util.List;

public class mybatisTest {

    public static void main(String[] args) throws Exception {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = builder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> all = userDao.findAll();
        for (User user : all) {
            System.out.println(user);
        }
        sqlSession.close();
        inputStream.close();
    }

}
