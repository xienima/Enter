package com.example.thymeleaf.repository;

import com.example.thymeleaf.domain.User;

import java.util.List;

public interface UserRepository {
//    新增或修改用户
    User saveOrUpateUser(User user);
//删除用户
    int deleteUser(Long id);
//获取用户id的用户
    User getUserById(Long id);
//获取所有用户的列表
    List<User> listUser();
}
