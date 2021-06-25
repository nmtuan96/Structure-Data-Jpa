package com.example.demo.service;

import com.example.demo.dto.ClassesDto;
import com.example.demo.entity.Classes;
import com.example.demo.repository.ClassesRepository;
import com.example.demo.service.interfaces.ClassesService;
import com.example.demo.service.interfaces.base.BaseService;
import ma.glasnost.orika.MapperFacade;
import org.springframework.stereotype.Service;

@Service
public class ClassesServiceImp extends BaseService<Classes, ClassesDto, Integer, ClassesRepository>
        implements ClassesService {

    public ClassesServiceImp(ClassesRepository repository, MapperFacade mapper){
        super(Classes.class, ClassesDto.class, repository, mapper);
    }
    private void sab (){
    }
}
