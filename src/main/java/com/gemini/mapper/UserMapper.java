package com.gemini.mapper;


import com.gemini.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User getUserById(int id);

    Long addUser(User user);

    int updateUser(User user);
}