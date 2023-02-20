package com.wyx.MoneyManager.Controller;

import com.wyx.MoneyManager.Entity.User;
import com.wyx.MoneyManager.Service.MoneyService;
import com.wyx.MoneyManager.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @ClassName UserController
 * @Author 一熹
 * @Date 2023/2/20 10:31
 * @Version 1.8
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;


    @GetMapping("/getUserById/{userId}")
    public User getUserByUserId(@PathVariable("userId") int userId) {
        return service.getUserById(userId);
    }

    @GetMapping("/initUser")
    public int initUser(String userName) {
        return service.initUser(userName);
    }

}
