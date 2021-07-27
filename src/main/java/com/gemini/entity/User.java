package com.gemini.entity;


import lombok.Data;

@Data
public class User {
    private Long id;
    private String userName;
    private String passWord;
    private String realName;
}
