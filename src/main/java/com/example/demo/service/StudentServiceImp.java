package com.example.demo.service;

import com.example.demo.dto.StudentDto;
import com.example.demo.entity.Student;
import com.example.demo.entity.Student_;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.interfaces.StudentService;
import com.example.demo.service.interfaces.base.BaseService;
import ma.glasnost.orika.MapperFacade;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp extends BaseService<Student, StudentDto, Integer, StudentRepository>
        implements StudentService {

    public StudentServiceImp(StudentRepository repository, MapperFacade mapper) {
        super(Student.class, StudentDto.class, repository, mapper);
    }

    @Override
    public List<Student> findByStudent(String name) {
        return this.getRepository().findAll(getQueryForEqual(name, Student_.NAME));
    }
}
