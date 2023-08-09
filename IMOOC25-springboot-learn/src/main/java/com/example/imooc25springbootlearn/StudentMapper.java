package com.example.imooc25springbootlearn;

import entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 *  学生 mapper
 */
@Mapper
@Repository
public interface StudentMapper {
    @Select("select * from  student where id = #{id}")
    Student  findById(Integer   id);
}
