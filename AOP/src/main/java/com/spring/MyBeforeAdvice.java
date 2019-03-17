package com.spring;

import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * 用户自定义的前置增强类
 * */
public class MyBeforeAdvice {
    private  static final Logger logger= LoggerFactory.getLogger(MyBeforeAdvice.class);
    /*定义前置方法*/
    public void beforeMethod() {
        logger.info("This is a before method ");
        logger.debug("This is a before method ");


       // System.out.println("This is a before methoad");
    }

}
