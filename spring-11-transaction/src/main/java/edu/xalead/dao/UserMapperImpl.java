package edu.xalead.dao;

import edu.xalead.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {
    public List<User> getUser() {

        User user = new User(5, "张三", "123123");
        addUser(user);

        deleteUserById(5);
        return getSqlSession().getMapper(UserMapper.class).getUser();
    }

    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    public void deleteUserById(int id) {
         getSqlSession().getMapper(UserMapper.class).deleteUserById(id);
    }
}
