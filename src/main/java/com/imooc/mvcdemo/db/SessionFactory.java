package com.imooc.mvcdemo.db;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public enum SessionFactory {
    
    INSTANCE;
    
    public SqlSession getSqlSession() throws IOException {
        // 获取配置文件新建
        Reader reader =  Resources.getResourceAsReader("MyBatis/config/config.xml");
        
        // 构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        
        // 获取session
        SqlSession sqlSession = sqlSessionFactory.openSession();
        
        return sqlSession;
    }
}
