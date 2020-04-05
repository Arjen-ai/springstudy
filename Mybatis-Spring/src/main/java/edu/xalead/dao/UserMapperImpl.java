package edu.xalead.dao;

import edu.xalead.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper {
    //我们的所有操作在原来使用sqlSession执行，现在使用SqlSessionTemplate;

    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> getUser() {
        return sqlSession.getMapper(UserMapper.class).getUser();
    }
}
