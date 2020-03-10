package com.jay.mybatis.sqlSession;


/**
 * 自定义mybatis中和数据库交互的核心类
 * 它里面可以创建dao接口的代理对象
 * @author Damocles
 */
public interface SqlSession {

    void close();

    /**
     * 根据参数创建一个代理对象
     * @param daoInterfaceClass Dao的接口字节码
     * @param <T>
     * @return
     */
    <T> T getMapper(Class<T> daoInterfaceClass);

}
