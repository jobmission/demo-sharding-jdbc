package com.revengemission.demo.sharding.controller;

import com.revengemission.demo.sharding.persistence.entity.OrderEntity;
import com.revengemission.demo.sharding.persistence.entity.OrderEntityExample;
import com.revengemission.demo.sharding.persistence.entity.UserEntity;
import com.revengemission.demo.sharding.persistence.entity.UserEntityExample;
import com.revengemission.demo.sharding.persistence.mapper.OrderEntityMapper;
import com.revengemission.demo.sharding.persistence.mapper.UserEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@Controller
public class TestController {

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
    @PostMapping("/common/user/create")
    public int createUser(@RequestHeader(value = "Authorization", required = false) String token,
                          @RequestParam(value = "userId") long userId,
                          @RequestParam(value = "username") String username) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUserId(userId);
        userEntity.setUsername(username);
        userEntity.setSortPriority(0);
        userEntity.setRecordStatus(1);
        userEntity.setVersion(0);
        return userEntityMapper.insert(userEntity);
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

    @ResponseBody
    @PostMapping("/common/order/create")
    public int createOrder(@RequestHeader(value = "Authorization", required = false) String token,
                           @RequestParam(value = "userId") long userId,
                           @RequestParam(value = "orderId") long orderId,
                           @RequestParam(value = "name") String name) {
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setOrderId(orderId);
        orderEntity.setUserId(userId);
        orderEntity.setName(name);
        orderEntity.setSortPriority(0);
        orderEntity.setRecordStatus(1);
        orderEntity.setVersion(0);
        return orderEntityMapper.insert(orderEntity);
    }
}

