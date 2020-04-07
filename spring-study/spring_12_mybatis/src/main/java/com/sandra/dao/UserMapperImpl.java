package com.sandra.dao;

import java.util.List;

import com.sandra.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

public class UserMapperImpl implements UserMapper{

    //单独Mybatis中所有的操作由sqlSession来执行，现在都使用sqlSessionTemplate；
    private SqlSessionTemplate sqlSessionTemplate;

    /**
     * Spring万物皆注入，一定有set方法；
     * 但是@Component注解配合扫描可不用set方法；
     * @param sqlSessionTemplate
     */
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    public List<User> getUsers() {
        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);

        return mapper.getUsers();
    }
}
