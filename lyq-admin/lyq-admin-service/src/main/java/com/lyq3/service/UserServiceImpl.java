package com.lyq3.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lyq3.api.UserService;
import com.lyq3.vo.User;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getUserName() {

        return "测试Dubbo";
    }
}
