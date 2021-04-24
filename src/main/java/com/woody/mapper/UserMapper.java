package com.woody.mapper;


import com.woody.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User getUserById(int id);

    Long addUser(User user);

    int updateUser(User user);
}