package com.lyq3.vo;

import java.io.Serializable;

/**
 * 用户实体类
 * @author lyq
 * 日期：2017/8/6
 */
public class User implements Serializable{
    /**用户名*/
    private String username = "";
    /**密码*/
    private String password = "";

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
