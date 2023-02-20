package com.wyx.MoneyManager.Controller;

import com.wyx.MoneyManager.Service.MoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName MoneyController
 * @Author 一熹
 * @Date 2023/2/20 14:36
 * @Version 1.8
 **/
@RestController
@RequestMapping("/money")
public class MoneyController {


    @Autowired
    private MoneyService service;

    @GetMapping("/modifyByUserId/{userId}/{moneyExchange}")
    public String modifyByUserId(@PathVariable int userId,
                                 @PathVariable double moneyExchange) {
        // 一次计算不能为负数,也不能大于999999
        if (moneyExchange > 999999) {
            return "400";
        }
        service.modifyByUserId(userId, moneyExchange);
        return "200";
    }

    @GetMapping("/getMoneyByName/{userName}")
    public double getMoneyByName(@PathVariable("userName") String userName) {
        return service.getMoneyByName(userName);
    }


}
