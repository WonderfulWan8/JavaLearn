package com.example.imooc25springbootlearn;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 演示：读取配置的Controller
 */
@RestController
public class PropertiesController {

    @Value("${school.grade}")
    Integer grade;
    @Value("${school.classNum}")
    Integer classNum;
    @GetMapping("/gradeclass")
    public String gradeClass(){
        return "年级："+grade+"班级："+classNum;
    }
}
