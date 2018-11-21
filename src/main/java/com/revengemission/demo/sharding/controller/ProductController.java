package com.revengemission.demo.sharding.controller;

import com.revengemission.demo.sharding.persistence.entity.OrderEntity;
import com.revengemission.demo.sharding.persistence.entity.OrderEntityExample;
import com.revengemission.demo.sharding.persistence.entity.UserEntity;
import com.revengemission.demo.sharding.persistence.entity.UserEntityExample;
import com.revengemission.demo.sharding.persistence.mapper.OrderEntityMapper;
import com.revengemission.demo.sharding.persistence.mapper.UserEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;
import java.util.List;

@Controller
public class ProductController {

    @Autowired
    OrderEntityMapper orderEntityMapper;

    @Autowired
    UserEntityMapper userEntityMapper;

    @ResponseBody
    @GetMapping("/common/user/list")
    public List<UserEntity> userList(@RequestHeader(value = "Authorization", required = false) String token, Principal principal) {
        System.out.println("principal:" + principal);
        return userEntityMapper.selectByExample(new UserEntityExample());
    }

    @ResponseBody
    @GetMapping("/common/order/list")
    public List<OrderEntity> orderList(@RequestHeader(value = "Authorization", required = false) String token,
                                       @RequestParam(value = "userId", required = false) Long userId,
                                       Principal principal) {
        System.out.println("principal:" + principal);
        OrderEntityExample entityExample = new OrderEntityExample();
        if (userId != null && userId > 0) {
            entityExample.createCriteria().andUserIdEqualTo(userId);
        }
        return orderEntityMapper.selectByExample(entityExample);
    }
}

