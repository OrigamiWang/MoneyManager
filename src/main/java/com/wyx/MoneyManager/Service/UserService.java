package com.wyx.MoneyManager.Service;


import com.wyx.MoneyManager.Entity.User;

public interface UserService {

    User getUserById(int userId);


    int initUser(String userName);
}
