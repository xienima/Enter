package com.example.thymeleaf.repository;

import com.example.thymeleaf.domain.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class UserRepositoryImpl implements UserRepository {
    private static AtomicLong counter = new AtomicLong();
    private final ConcurrentMap<Long,User> userMap=new ConcurrentHashMap<Long,User>();

    @Override
    public User saveOrUpdateUser(User user){
        Long id=user.getId();
        if(id==null){
            id=counter.incrementAndGet();
            user.setId(id);
        }
        this.userMap.put(id,user);
        return user;
    }
    @Override
    public int deleteUser(Long id){
        this.userMap.remove(id);
        return id.intValue();
    }
    @Override
    public User getUserById(Long id){
        return this.userMap.get(id);
    }
    @Override
    public List<User> listUser(){
        return new ArrayList<User>(this.userMap.values());
    }
}
