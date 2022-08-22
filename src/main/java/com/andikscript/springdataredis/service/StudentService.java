package com.andikscript.springdataredis.service;

import com.andikscript.springdataredis.model.Student;

import java.util.List;

public interface StudentService {

    void addStudent(Student student);

    List getAllStudent();
}
