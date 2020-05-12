package com.wenhao.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayController {

    @GetMapping("/pay")
    public void payController(){
        System.out.println("支付方式调用");
    }
}
