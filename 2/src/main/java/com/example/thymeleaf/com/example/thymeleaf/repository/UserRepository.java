package com.example.thymeleaf.com.example.thymeleaf.repository;

import org.apache.catalina.User;

import java.util.List;

public interface UserRepository {
//    新建用户
    User saveOrUpdateUser(User user);

//  删除用户
    void deleteUser(Long id);
// 获取用户id
    User getUserById(Long id);
//  获取用户的列表
    List<User> ListUser();

}
