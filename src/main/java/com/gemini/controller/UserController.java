package com.gemini.controller;

import com.gemini.entity.User;
import com.gemini.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("addUser")
    public User addUser(User user){
        try{

            userService.addUser(user);
            log.info("addUser");
        }catch (Exception e){
            log.error("错误", e);
        }
        return user;
    }

    @RequestMapping("updateUser")
    public User updateUser(User user){
        try{
            userService.updateUser(user);
            log.info("updateUser");
        }catch (Exception e){
            log.error("错误", e);
        }
        return user;
    }

    @RequestMapping("getUser/{id}")
    public User getUser(@PathVariable Long id){
        User user = null;
        try{
            user = userService.getUserById(id);
            log.info("getUser");
        }catch (Exception e){
            log.error("错误", e);
        }
        return user;
    }

    @RequestMapping("removeUserById")
    public Long removeUserById(Long id){
        try{
            userService.removeUserById(id);
            log.info("removeUserById");
        }catch (Exception e){
            log.error("错误", e);
        }
        return id;
    }
}
