package edu.xalead.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UserDaoMySqlImp implements UserDao {
    @Value("Mysql")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void getUser() {
        System.out.println("获取MySQL数据");
    }
}
