package edu.xalead.dao;

import org.springframework.beans.factory.annotation.Value;

public class UserDaoSqlserverImpl implements  UserDao{

    public void getUser() {
        System.out.println("获取sqlservice数据");
    }
}
