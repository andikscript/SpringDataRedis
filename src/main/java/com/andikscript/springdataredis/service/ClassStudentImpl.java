package com.andikscript.springdataredis.service;

import com.andikscript.springdataredis.model.ClassStudent;
import com.andikscript.springdataredis.repository.ClassStudentRepository;
import org.springframework.stereotype.Service;

@Service
public class ClassStudentImpl implements ClassStudentService {

    private final ClassStudentRepository classStudentRepository;

    public ClassStudentImpl(ClassStudentRepository classStudentRepository) {
        this.classStudentRepository = classStudentRepository;
    }

    @Override
    public void addClass(ClassStudent classStudent) {
        classStudentRepository.save(classStudent);
    }

    @Override
    public Iterable getAllClass() {
        return classStudentRepository.findAll();
    }
}
