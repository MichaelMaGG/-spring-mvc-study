package com.imooc.mvcdemo.service;

import org.springframework.stereotype.Service;

import com.imooc.mvcdemo.model.Manager;

@Service
public interface ManagerService {
	
    void insert(Manager manager);
}
