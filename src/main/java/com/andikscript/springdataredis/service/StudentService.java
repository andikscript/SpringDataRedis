package com.andikscript.springdataredis.service;

import com.andikscript.springdataredis.model.Student;
import com.andikscript.springdataredis.model.StudentPost;

import java.util.List;

public interface StudentService {

    void addStudent(StudentPost studentPost);

    Iterable getAllStudent();

    Student findById(String id);
}
