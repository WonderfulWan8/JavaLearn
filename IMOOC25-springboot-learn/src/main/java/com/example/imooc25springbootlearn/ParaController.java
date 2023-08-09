package com.example.imooc25springbootlearn;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述：演示各种传参形式
 */
@RestController
public class ParaController {
    @GetMapping("/firstrequest")
    public String firstRequest(){
        return "Hello world";
    }
    @GetMapping("/requestpara")
    public String requestpara(@RequestParam Integer num){
        return "Hello world"+num;
    }
    @GetMapping("/pathpara/{num}")
    public String pathpara(@PathVariable Integer num){
        return "path"+num;
    }

    @GetMapping({"/multiurl1","/multiurl2"})
    public String multiple(@RequestParam  Integer num){
        return "multiple"+num;
    }

    //默认传参
    @GetMapping("/required")
    public String require(@RequestParam(required = false,defaultValue = "0") Integer num){
        return "require"+num;
    }

}
