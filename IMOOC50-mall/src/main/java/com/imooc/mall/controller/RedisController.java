package com.imooc.mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 **/
@RestController
@RequestMapping("/redis")
public class RedisController {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @GetMapping(value = "getUserByRedis")
    public String getIndex(){
        stringRedisTemplate.opsForValue().set("xiaocai", "999");
        String res = stringRedisTemplate.opsForValue().get("xiaocai");
        System.out.println(res);
        return res;
    }
}