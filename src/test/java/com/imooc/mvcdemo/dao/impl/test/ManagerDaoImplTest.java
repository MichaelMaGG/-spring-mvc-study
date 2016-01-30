package com.imooc.mvcdemo.dao.impl.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.imooc.mvcdemo.dao.impl.ManagerDaoImpl;

public class ManagerDaoImplTest {

    @Test
    public void testGetManagerInfo() {
        
        ManagerDaoImpl impl = new ManagerDaoImpl();
        assertTrue(!impl.getManagerInfo().isEmpty());

    }

    @Test
    public void testCountManagers() {
        fail("Not yet implemented");
    }

}
