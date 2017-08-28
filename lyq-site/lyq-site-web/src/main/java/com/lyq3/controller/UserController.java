package com.lyq3.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lyq3.api.UserService;
import com.lyq3.vo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 用户Controller
 * @author   lyq
 * Date : 2017/8/6
 */
@Controller
public class UserController {
    @Reference
    private UserService userService;

    @GetMapping("/test")
    @ResponseBody
//    @RequiresUser
    public User test(){
        return userService.getUserById();
    }

    @RequestMapping("/index")
    public String test2(Model model){


//        model.addAttribute("title","1233");
        return "index";
    }

}
