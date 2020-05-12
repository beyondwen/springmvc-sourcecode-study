package com.wenhao.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PayController {

    @GetMapping("/pay")
    public String payController(){
        System.out.println("支付方式调用");
        return "pay";
    }
}
