package com.example.demo.controller;

import com.example.demo.dto.StudentDto;
import com.example.demo.entity.Student;
import com.example.demo.service.interfaces.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping
    public ResponseEntity<Iterable<StudentDto>> showList(){
        return new ResponseEntity<>(studentService.findAll(),HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<StudentDto> createStudent(@RequestBody StudentDto studentDto){
        studentService.save(studentDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/search")
    public ResponseEntity<Iterable<Student>> searchListStudentToName(@RequestBody StudentDto studentDto){
        return new ResponseEntity<>(studentService.findByStudent(studentDto.getName()), HttpStatus.OK);
    }
}
