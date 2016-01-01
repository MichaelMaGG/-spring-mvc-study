package com.imooc.mvcdemo.dao.impl;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.imooc.mvcdemo.dao.BaseDao;
import com.imooc.mvcdemo.db.DBAccess;
import com.imooc.mvcdemo.model.User;

public class UserDaoImpl implements BaseDao {
    
    public List<User> getUserInfo() {
        DBAccess dbAccess = new DBAccess();
        SqlSession sqlSession = null;
        
        try {
            sqlSession = dbAccess.getSqlSession();
        }
        catch (IOException ex) {
            // 
            
        }
        finally {
            sqlSession.close();
        }
        
        return null;
    }
    
}
