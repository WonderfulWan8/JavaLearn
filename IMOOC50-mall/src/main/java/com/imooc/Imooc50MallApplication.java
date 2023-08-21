package com.imooc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan(basePackages = "com.imooc.mall.model.dao")
@EnableCaching
public class Imooc50MallApplication {

    public static void main(String[] args) {
        SpringApplication.run(Imooc50MallApplication.class, args);
    }

}
