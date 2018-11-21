package com.revengemission.demo.sharding;

import com.revengemission.demo.sharding.persistence.entity.OrderEntity;
import com.revengemission.demo.sharding.persistence.entity.OrderEntityExample;
import com.revengemission.demo.sharding.persistence.entity.UserEntity;
import com.revengemission.demo.sharding.persistence.entity.UserEntityExample;
import com.revengemission.demo.sharding.persistence.mapper.OrderEntityMapper;
import com.revengemission.demo.sharding.persistence.mapper.UserEntityMapper;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootContextTest {

    @Autowired
    UserEntityMapper userEntityMapper;

    @Autowired
    OrderEntityMapper orderEntityMapper;

    @Test
    @Ignore
    @Rollback(value = false)
    public void testInsertUser() {
        for (int i = 1; i <= 48; i++) {
            UserEntity userEntity = new UserEntity();
            userEntity.setUserId(i * 1l);
            userEntity.setUsername(RandomStringUtils.randomAlphabetic(8));
            userEntity.setSortPriority(i);
            userEntity.setRecordStatus(1);
            userEntity.setVersion(0);
            userEntityMapper.insert(userEntity);
        }

        System.out.println("total =" + userEntityMapper.countByExample(new UserEntityExample()));

    }

    @Test
    @Ignore
    @Rollback(value = false)
    public void testInsertOrder() {
        for (int i = 1; i <= 18; i++) {
            OrderEntity orderEntity = new OrderEntity();
            orderEntity.setOrderId(i * 1l);
            orderEntity.setUserId(RandomUtils.nextLong(1, 4));
            orderEntity.setSortPriority(i);
            orderEntity.setRecordStatus(1);
            orderEntity.setVersion(0);
            orderEntityMapper.insert(orderEntity);
        }

        System.out.println("total =" + orderEntityMapper.countByExample(new OrderEntityExample()));

    }

}
