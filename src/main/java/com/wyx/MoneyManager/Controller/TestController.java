package com.wyx.MoneyManager.Controller;

import com.wyx.MoneyManager.Service.MoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Author 一熹
 * @Date 2023/2/20 9:33
 * @Version 1.8
 **/
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private MoneyService moneyService;


    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World!";
    }


}
