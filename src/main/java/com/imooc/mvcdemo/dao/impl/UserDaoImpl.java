package com.imooc.mvcdemo.dao.impl;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.imooc.mvcdemo.dao.BaseDao;
import com.imooc.mvcdemo.db.DBAccess;
import com.imooc.mvcdemo.model.User;
import com.imooc.mvcdemo.util.LogUtil;

public class UserDaoImpl implements BaseDao {
    
    public List<User> getUserInfo() {
        DBAccess dbAccess = new DBAccess();
        SqlSession sqlSession = null;
        
        try {
            sqlSession = dbAccess.getSqlSession();
            List<User> list = sqlSession.selectList("queryUserList");
        }
        catch (IOException ex) {
            Logger log = LogUtil.INSTANCE.getLog(UserDaoImpl.class);
            log.debug("UserDaoImpl.getUserInfo was wrong!");
        }
        finally {
            sqlSession.close();
        }
        
        return null;
    }
    
}
