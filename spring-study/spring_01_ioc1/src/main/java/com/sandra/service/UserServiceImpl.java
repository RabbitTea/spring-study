package com.sandra.service;

import com.sandra.dao.UserDao;
import com.sandra.dao.UserDaoImpl;

/**
 * 业务层：用户服务实现类
 */
public class UserServiceImpl implements UserService{

    /**
     * 业务层调Dao层的接口的传统做法;
     * 将dao引入：声明接口，实际new的是实现类；
     */
    //private UserDao userDao = new UserDaoImpl();

    private UserDao userDao;

    /**
     * 利用set实现动态的值注入
     * @param userDao
     */
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
