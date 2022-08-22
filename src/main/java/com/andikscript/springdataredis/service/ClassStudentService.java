package com.andikscript.springdataredis.service;

import com.andikscript.springdataredis.model.ClassStudent;

public interface ClassStudentService {

    void addClass(ClassStudent classStudent);

    Iterable getAllClass();
}
