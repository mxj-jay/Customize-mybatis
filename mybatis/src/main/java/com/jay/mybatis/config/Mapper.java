package com.jay.mybatis.config;


/**
 * 用于封装执行的SQL语句和结果类型的全限定类名
 * @author Damocles
 */
public class Mapper {

    // SQL语句
    private String QueryString;
    // 实体类的全限定类名
    private String resultType;

    public String getQueryString() {
        return QueryString;
    }

    public void setQueryString(String queryString) {
        QueryString = queryString;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }
}
