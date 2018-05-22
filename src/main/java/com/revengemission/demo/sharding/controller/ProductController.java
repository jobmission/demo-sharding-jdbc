package com.revengemission.demo.sharding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;

@Controller
public class ProductController {

    @ResponseBody
    @GetMapping("/common/product/list")
    public String list(@RequestHeader(value = "Authorization") String token, Principal principal) {
        System.out.println(principal);
        return "many to many";
    }

    @ResponseBody
    @GetMapping("/user/product/list")
    public String user(@RequestHeader(value = "Authorization") String token, Principal principal) {
        System.out.println(principal);
        return "many to many";
    }


    @ResponseBody
    @GetMapping("/system/product/list")
    public String system(@RequestHeader(value = "Authorization") String token, Principal principal) {
        System.out.println(principal);
        return "many to many";
    }
}
