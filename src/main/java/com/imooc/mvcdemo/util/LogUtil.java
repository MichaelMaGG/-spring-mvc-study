package com.imooc.mvcdemo.util;

import org.apache.log4j.Logger;


public enum LogUtil {

    INSTANCE;
    
    @SuppressWarnings("rawtypes")
    public Logger getLog(Class clazz) {
        return Logger.getLogger(clazz);
    }
    
}
