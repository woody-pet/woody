package com.gemini.service;


import com.gemini.entity.User;

public interface UserService {
    User getUserById(Long id);

    Long addUser(User user);

    Integer updateUser(User user);

    Integer removeUserById(Long id);

}