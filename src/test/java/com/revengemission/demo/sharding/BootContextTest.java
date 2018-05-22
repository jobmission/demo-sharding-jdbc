package com.revengemission.demo.sharding;

import com.revengemission.demo.sharding.persistence.entity.UserEntity;
import com.revengemission.demo.sharding.persistence.entity.UserEntityExample;
import com.revengemission.demo.sharding.persistence.mapper.UserEntityMapper;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootContextTest {

    @Autowired
    UserEntityMapper userEntityMapper;

    @Test
    @Ignore
    //@Rollback(value = false)
    public void testInsert() throws Exception {
        for (int i = 50; i <= 70; i++) {
            UserEntity userEntity = new UserEntity();
            userEntity.setUserId(i * 1l);
            userEntity.setSortPriority(i);
            userEntity.setRecordStatus(1);
            userEntity.setUsername(RandomStringUtils.randomAlphabetic(8));
            userEntityMapper.insert(userEntity);
        }

        System.out.println("total =" + userEntityMapper.countByExample(new UserEntityExample()));

    }

    @Test
    //@Ignore
    public void testCount() throws Exception {
        System.out.println("total=" + userEntityMapper.countByExample(new UserEntityExample()));

    }

}
