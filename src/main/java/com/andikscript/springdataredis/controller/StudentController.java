package com.andikscript.springdataredis.controller;

import com.andikscript.springdataredis.model.Student;
import com.andikscript.springdataredis.model.StudentPost;
import com.andikscript.springdataredis.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping(value = "/add", consumes = "application/json")
    public ResponseEntity<?> addStudent(@RequestBody StudentPost studentPost) {
        studentService.addStudent(studentPost);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body("created");
    }

    @GetMapping(value = "/all")
    public ResponseEntity<?> getAllStudent() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(studentService.getAllStudent());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> getStudent(@PathVariable(value = "id") String id) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(studentService.findById(id));
    }
}
