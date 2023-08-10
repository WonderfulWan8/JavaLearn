package com.imooc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.imooc.mall.model.dao")
public class Imooc50MallApplication {

    public static void main(String[] args) {
        SpringApplication.run(Imooc50MallApplication.class, args);
    }

}
