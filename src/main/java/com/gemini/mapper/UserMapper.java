package com.gemini.mapper;


import com.gemini.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User getUserById(Long id);

    Long addUser(User user);

    Integer updateUser(User user);

    Integer removeUserById(Long id);
}