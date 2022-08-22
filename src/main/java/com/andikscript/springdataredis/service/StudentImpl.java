package com.andikscript.springdataredis.service;

import com.andikscript.springdataredis.model.Student;
import com.andikscript.springdataredis.model.StudentPost;
import com.andikscript.springdataredis.repository.StudentRepository;
import com.andikscript.springdataredis.utils.RandomNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentImpl implements StudentService {

    private final StudentRepository studentRepository;

    private final RandomNumber random;

    public StudentImpl(StudentRepository studentRepository, RandomNumber random) {
        this.studentRepository = studentRepository;
        this.random = random;
    }

    @Override
    public void addStudent(StudentPost studentPost) {
        studentRepository.save(new Student(random.randomNumber(),
                studentPost.getName(), studentPost.getGrade()));
    }

    @Override
    public Iterable getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(String id) {
        return studentRepository.findById(id).get();
    }
}
