package com.example.imooc25springbootlearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 描述： 读取配置类
 */
public class ConfigController {
    @Autowired
    SchoolConfig schoolConfig;
    @GetMapping("/gradeclassTest")
    public String gradeclass(){
        return "年级312："+schoolConfig.grade+"班级311："+schoolConfig.classnum;
    }
}
