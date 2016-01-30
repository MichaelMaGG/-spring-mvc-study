package com.imooc.mvcdemo.service.impl;

import java.sql.Timestamp;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.imooc.mvcdemo.dao.ManagerDao;
import com.imooc.mvcdemo.model.Manager;
import com.imooc.mvcdemo.service.ManagerService;

@Service("managerService")
public class ManagerServiceImpl implements ManagerService {

    @Resource
    private ManagerDao managerDao;
    
    public void insert(Manager manager) {
        manager.setTimeStamp(new Timestamp(System.currentTimeMillis()));

        managerDao.insertManager(manager);
    }
    
}
