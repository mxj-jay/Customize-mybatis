package com.jay.mybatis.sqlSession;

public interface SqlSessionFactory {
    /**
     * 用于打开一个新的SqlSession
     * @return
     */
    SqlSession openSession();

}
