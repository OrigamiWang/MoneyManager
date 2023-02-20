package com.wyx.MoneyManager.Service;

public interface MoneyService {

    void modifyByUserId(int userId, double moneyExchange);

    double getMoneyByName(String userName);

    void insertMoney();

    int getSum();
}

