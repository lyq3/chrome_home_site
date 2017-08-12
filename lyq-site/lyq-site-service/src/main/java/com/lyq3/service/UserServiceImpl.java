package com.lyq3.service;

import com.lyq3.api.UserService;
import com.lyq3.mapper.UserMapper;
import com.alibaba.dubbo.config.annotation.Service;
import com.lyq3.vo.User;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 用户Service实现类
 */
@Service
public class UserServiceImpl implements UserService {
    /**用户Mapper*/
    @Autowired
    private UserMapper userMapper;

    public User getUserById(){
        User user = userMapper.selectById(1);
        return user;
    }

}
