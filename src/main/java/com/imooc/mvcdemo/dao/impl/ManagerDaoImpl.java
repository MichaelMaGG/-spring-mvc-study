package com.imooc.mvcdemo.dao.impl;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.imooc.mvcdemo.dao.ManagerDao;
import com.imooc.mvcdemo.db.SessionFactory;
import com.imooc.mvcdemo.model.Manager;
import com.imooc.mvcdemo.util.LogUtil;

@Repository
public class ManagerDaoImpl implements ManagerDao {
    
    public List<Manager> getManagerInfo() {
        List<Manager> list = null;
        SqlSession sqlSession = null;
        
        try {
            sqlSession = SessionFactory.INSTANCE.getSqlSession();
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
        int count = -1;
        SqlSession sqlSession = null;
        
        try {
            sqlSession = SessionFactory.INSTANCE.getSqlSession();
            count = sqlSession.selectOne("countUsers");
        } catch (IOException ex) {
            Logger log = LogUtil.INSTANCE.getLog(ManagerDaoImpl.class);
            log.debug("UserDaoImpl.countManagers() had error:",ex);
        } finally {
            sqlSession.close();
        }
        return count;
    }
    
    public void insertManager(Manager manager) {
        SqlSession sqlSession = null;
        
        try {
            sqlSession = SessionFactory.INSTANCE.getSqlSession();
            sqlSession.insert("insertManager", manager);
            sqlSession.commit();
        } catch (IOException ex) {
            Logger log = LogUtil.INSTANCE.getLog(ManagerDaoImpl.class);
            log.debug("UserDaoImpl.insertManager() had error:",ex);
        } finally {
            sqlSession.close();
        }
    }
    
}
