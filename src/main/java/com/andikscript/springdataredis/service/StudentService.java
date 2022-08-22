package com.andikscript.springdataredis.service;

import com.andikscript.springdataredis.model.Student;

import java.util.List;

public interface StudentService {

    void addStudent(Student student);

    Iterable getAllStudent();

    Student findById(String id);
}
