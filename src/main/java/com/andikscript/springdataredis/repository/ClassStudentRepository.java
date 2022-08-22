package com.andikscript.springdataredis.repository;

import com.andikscript.springdataredis.model.ClassStudent;
import org.springframework.data.repository.CrudRepository;

public interface ClassStudentRepository extends CrudRepository<ClassStudent, String> {
}
