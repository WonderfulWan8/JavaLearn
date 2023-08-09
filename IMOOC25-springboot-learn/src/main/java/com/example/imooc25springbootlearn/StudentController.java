package com.example.imooc25springbootlearn;

import entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述：学生controller
 */

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping({"/student"})
    public String student(@RequestParam Integer num) {
        Student student
                = studentService.findStudent(num);
        return student.toString();
    }

//    @GetMapping("/student")
//    public String student(@RequestParam Integer num) {
//        Student student = studentService.findStudent(num);
//        return student.toString();
//    }

}
