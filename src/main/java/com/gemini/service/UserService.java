package com.gemini.service;


import com.gemini.entity.User;
import com.gemini.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;


    @Transactional
    public User getUserById(int id){

//        User user = new User(null,"wangwu","123","王五");
//        userMapper.addUser(user);
//
//        user.setRealName("王五修改后");
//        userMapper.updateUser(user);

        return userMapper.getUserById(id);
    }
}