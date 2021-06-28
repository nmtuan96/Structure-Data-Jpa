package com.example.demo.service.interfaces;

import com.example.demo.dto.StudentDto;
import com.example.demo.entity.Student;
import com.example.demo.service.interfaces.base.IService;

import java.util.List;

public interface StudentService extends IService<StudentDto, Integer> {
    List<Student> findByStudent(String name);
}
