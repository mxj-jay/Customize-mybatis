package com.jay.mybatis.sqlSession.proxy;

import com.jay.mybatis.config.Mapper;
import com.jay.mybatis.util.Executor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.util.Map;

/**
 * @author Damocles
 */
public class MapperProxy implements InvocationHandler {

    private Map<String, Mapper> mappers;
    private Connection connection;

    public MapperProxy(Map<String, Mapper> mappers, Connection connection) {
        this.mappers = mappers;
        this.connection = connection;
    }

    /**
     * 对方法进行增强,实际就是调用selectList方法
     *
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        String methodName = method.getName();
        String className = method.getDeclaringClass().getName();
        String key = className + "." + methodName;

        Mapper mapper = mappers.get(key);
        if (mapper == null) {
            throw new IllegalArgumentException("传入参数异常");
        }

        return new Executor().selectList(mapper, connection);
    }

}
