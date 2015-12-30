package com.imooc.mvcdemo.main;

import org.apache.log4j.Logger;

import com.imooc.mvcdemo.util.LogUtil;

public class LogTest {

    public static void main(String[] args) {
        
        Logger logger = LogUtil.INSTANCE.getLog(LogTest.class);
        logger.debug("开始1");
        logger.debug("结束1");
    }

}
