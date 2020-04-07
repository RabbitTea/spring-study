package com.sandra.dao;

import java.util.List;

import com.sandra.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {


    public List<User> getUsers() {

        return getSqlSession().getMapper(UserMapper.class).getUsers();
    }
}
