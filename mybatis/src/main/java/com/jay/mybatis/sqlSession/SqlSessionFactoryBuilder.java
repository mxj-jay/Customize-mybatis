package com.jay.mybatis.sqlSession;


import com.jay.mybatis.config.Configuration;
import com.jay.mybatis.sqlSession.defaults.DefaultSqlSessionFactory;
import com.jay.mybatis.util.XMLConfigBuilder;

import java.io.InputStream;

/**
 * 自定义mybatis - 2
 * 用于创建一个sqlSessionFactory对象
 * @author Damocles
 */
public class SqlSessionFactoryBuilder {

    public SqlSessionFactory build(InputStream config){
        Configuration cfg = XMLConfigBuilder.loadConfiguration(config);
        return new DefaultSqlSessionFactory(cfg);
    }

}
