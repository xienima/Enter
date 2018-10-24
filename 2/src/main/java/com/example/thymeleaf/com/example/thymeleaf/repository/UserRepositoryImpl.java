package com.example.thymeleaf.com.example.thymeleaf.repository;

import org.apache.catalina.User;
import org.springframework.stereotype.Repository;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class UserRepositoryImpl {
    private static AtomicLong compluter=new AtomicLong();

    private final ConcurrentMap<Long,User> userMap = new ConcurrentHashMap<Long,User>();
}
