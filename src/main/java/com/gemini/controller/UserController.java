package com.gemini.controller;

import com.gemini.entity.User;
import com.gemini.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("getUser/{id}")
    public User getUser(@PathVariable int id){
        User user = null;
        try{

            user = userService.getUserById(id);
        }catch (Exception e){
            log.error("错误", e);
        }
        return user;
    }
}
