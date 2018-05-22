package com.revengemission.demo.sharding.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@MapperScan("com.revengemission.demo.sharding.persistence.mapper")
public class MapperScannerConfig {

}

