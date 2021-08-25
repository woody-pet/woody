package com.gemini.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author wuchao
 * @since 2021-08-25 17:19:39
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = -78805210617229530L;

    private Long id;

    private String username;

    private String password;

    private String realname;

    private Long depid;

}
