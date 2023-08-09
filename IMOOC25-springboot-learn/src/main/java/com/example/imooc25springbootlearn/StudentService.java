package com.example.imooc25springbootlearn;

import entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述 ：学生Service
 */
@Service
public class StudentService {
    @Autowired
    StudentMapper studentMapper;
    public Student findStudent(Integer id){
        return studentMapper.findById(id);
    }
}
