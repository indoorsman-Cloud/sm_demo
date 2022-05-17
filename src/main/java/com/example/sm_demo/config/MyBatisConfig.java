package com.example.sm_demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.example.sm_demo.mbg.mapper")
public class MyBatisConfig {
}
