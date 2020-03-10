package com.jay.mybatis.sqlSession.defaults;

import com.jay.mybatis.config.Configuration;
import com.jay.mybatis.sqlSession.SqlSession;
import com.jay.mybatis.sqlSession.SqlSessionFactory;

/**
 * SqlSessionFactory的实现类
 * @author Damocles
 */
public class DefaultSqlSessionFactory implements SqlSessionFactory {

    private Configuration cfg;

    public DefaultSqlSessionFactory(Configuration cfg){
        this.cfg = cfg;
    }

    public SqlSession openSession() {
        return new DefaultSqlSession(cfg);
    }

}
