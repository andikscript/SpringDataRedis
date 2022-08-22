package com.andikscript.springdataredis.service;

import com.andikscript.springdataredis.model.Student;
import com.andikscript.springdataredis.repository.StudentRepository;

import java.util.List;

public class StudentImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public List getAllStudent() {
        return studentRepository.findAll();
    }
}
