package com.lagou.dao;

import com.lagou.pojo.User;

import java.util.List;

/**
 * @author ying
 * @version 1.0
 * @date 2021-02-04 00:14
 */
public interface IUserDao {

    User findById(User user);

    List<User> findAll();
}
