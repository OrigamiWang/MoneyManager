package com.wyx.MoneyManager.Service.impl;

import com.wyx.MoneyManager.Mapper.MoneyMapper;
import com.wyx.MoneyManager.Service.MoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName MoneyServiceImpl
 * @Author 一熹
 * @Date 2023/2/20 14:34
 * @Version 1.8
 **/
@Service
public class MoneyServiceImpl implements MoneyService {

    @Autowired
    private MoneyMapper mapper;


    @Override
    public void modifyByUserId(int userId, double moneyExchange) {
        mapper.modifyByUserId(userId, moneyExchange);
    }


}
