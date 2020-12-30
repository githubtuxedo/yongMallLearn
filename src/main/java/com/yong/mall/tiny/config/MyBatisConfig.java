package com.yong.mall.tiny.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.yong.mall.tiny.mbg.mapper", "com.yong.mall.tiny.dao"})
public class MyBatisConfig {
}
