package com.sandra.dao;

import java.util.List;

import com.sandra.pojo.User;

public interface UserMapper {

    List<User> getUsers();

    /**
     * 添加一个用户
     * @param user
     * @return
     */
    int addUser(User user);

    /**
     * 删除一个用户
     * @param id
     * @return
     */
    int deleteUser(int id);
}
