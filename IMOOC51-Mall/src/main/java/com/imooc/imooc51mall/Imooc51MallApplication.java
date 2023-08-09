package com.imooc.imooc51mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.imooc.mall.model.dao")
public class Imooc51MallApplication {

    public static void main(String[] args) {
        SpringApplication.run(Imooc51MallApplication.class, args);
    }

}
