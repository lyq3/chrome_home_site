package com.lyq3.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lyq3.api.UserService;
import org.apache.shiro.authz.annotation.RequiresUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 用户Controller
 * @author lyq
 * Date : 2017/8/6
 */
@Controller
public class UserController {
    @Reference
    private UserService userService;

    @GetMapping("/test")
    @ResponseBody
    @RequiresUser
    public String test(){
        return userService.getUserName();
    }

}
