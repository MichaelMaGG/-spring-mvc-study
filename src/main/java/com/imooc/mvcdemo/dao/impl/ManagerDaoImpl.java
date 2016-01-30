package com.imooc.mvcdemo.dao.impl;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.imooc.mvcdemo.dao.BaseDao;
import com.imooc.mvcdemo.db.DBAccess;
import com.imooc.mvcdemo.model.Manager;
import com.imooc.mvcdemo.util.LogUtil;

public class ManagerDaoImpl implements BaseDao {
    
    public List<Manager> getManagerInfo() {
        DBAccess dbAccess = new DBAccess();
        SqlSession sqlSession = null;
        List<Manager> list = null;
        
        try {
            sqlSession = dbAccess.getSqlSession();
            list = sqlSession.selectList("queryManagerList");
        }
        catch (IOException ex) {
            Logger log = LogUtil.INSTANCE.getLog(ManagerDaoImpl.class);
            log.debug("UserDaoImpl.getUserInfo() had error:",ex);
        }
        finally {
            sqlSession.close();
        }
        
        return list;
    }
    
    public int countManagers() {
        
        return 1;
    }
    
    public static void main(String[] args) {
        ManagerDaoImpl impl = new ManagerDaoImpl();
        System.out.println(impl.getManagerInfo());
    }
    
    
}
