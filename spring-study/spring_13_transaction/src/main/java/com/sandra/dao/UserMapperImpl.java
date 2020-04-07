package com.sandra.dao;

import java.util.List;

import com.sandra.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper{

    public List<User> getUsers() {

        /**
         * 这里为了测试事务ACID属性；
         * 在查询前加入插入方法，查询后加入删除方法；
         * 在删除的Sql中故意写错，测试一个操作的错误是否也会保证同事务中的其他操作不执行，即这里的插入方法；
         */
        User user = new User(6, "测试事务ACID", "123");
        int addR = addUser(user);
        int delR = deleteUser(6);

        return getSqlSession().getMapper(UserMapper.class).getUsers();
    }

    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    public int deleteUser(int id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }

}
