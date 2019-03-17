package com.experice;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
@Aspect
public class Fighter {
    @Pointcut("execution(* com.experice.Tiger.walk())")
    public void foundTiger(){

    }
    @Before(value="foundTiger()")
    public void foundBefore(){
        System.out.println("Fighter wait for Tiger...");
    }
    @AfterReturning("foundTiger()")
    public void foundAfter(){
        System.out.println("Fighter flight with Tiger...");
    }
}
