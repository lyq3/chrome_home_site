package com.lyq3.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lyq3.api.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
    @Override
    public String test() {
        return "哈哈哈哈哈";
    }
}
