package com.imooc.mvcdemo.dao.impl;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public enum GetSessionFactory {
    
    INSTANCE;
    
    public SqlSessionFactory getSessionFactory() {
        String resource = "/spring-mvc-study/src/main/resources/MyBatis/mybatis-config.xml";
        InputStream inputStream;
        SqlSessionFactory sqlSessionFactory = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            //
            
        }
        
        return sqlSessionFactory;
    }
}
