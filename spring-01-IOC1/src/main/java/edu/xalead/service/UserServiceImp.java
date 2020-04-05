package edu.xalead.service;

import edu.xalead.dao.*;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImp implements UserService {
    private UserDao userDao;
//    private UserDao userDao = new UserDaoMySqlImp();
//    private UserDao userDao = new UserDaoOracleImp();
//    private UserDao userDao = new UserDaoSqlserverImpl();
    public void getUser() {
        userDao.getUser();
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
