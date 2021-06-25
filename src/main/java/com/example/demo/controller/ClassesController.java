package com.example.demo.controller;

import com.example.demo.dto.ClassesDto;
import com.example.demo.service.interfaces.ClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/classes")
public class ClassesController {
    @Autowired
    private ClassesService classesService;

    @GetMapping
    public ResponseEntity<Iterable<ClassesDto>> showList(){
        return new ResponseEntity<>(classesService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ClassesDto> createGroup(@RequestBody ClassesDto groupDto){
        classesService.save(groupDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
