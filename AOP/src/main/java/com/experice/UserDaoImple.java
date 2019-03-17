package com.experice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserDaoImple implements UserDao{
    private static final Logger logger= LoggerFactory.getLogger(UserDaoImple.class);
    @Override
    public void insert() {
        logger.info("进行插入操作");
    }
}
