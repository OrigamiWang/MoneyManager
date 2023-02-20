package com.wyx.MoneyManager.Mapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName MoneyMapper
 * @Author 一熹
 * @Date 2023/2/20 10:42
 * @Version 1.8
 **/
@Mapper
public interface MoneyMapper {
    double getMoneyByUserId(int userId);

    void modifyByUserId(int userId, double moneyExchange);

    double getMoneyByName(String userName);

    /***
    * @return: int 返回插入的数据的money_id
    */
    void insertMoney();

    int getSum();
}
