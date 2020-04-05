package edu.xalead.dao;

import edu.xalead.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    public List<User> getUser();

    //
    public int addUser(User user);
    //
    public void deleteUserById(@Param("id") int id);
}
