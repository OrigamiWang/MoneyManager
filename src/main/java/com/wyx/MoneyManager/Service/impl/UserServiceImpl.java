package com.wyx.MoneyManager.Service.impl;

import com.wyx.MoneyManager.Entity.User;
import com.wyx.MoneyManager.Mapper.UserMapper;
import com.wyx.MoneyManager.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Author 一熹
 * @Date 2023/2/20 10:34
 * @Version 1.8
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;


    @Override
    public User getUserById(int userId) {
        return mapper.getUserByUserId(userId);
    }
}
