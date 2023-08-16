package com.imooc;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootTest
@MapperScan(basePackages = "com.imooc.mall.model.dao")
@EnableSwagger2
class Imooc50MallApplicationTests {

    @Test
    void contextLoads() {
    }

}
