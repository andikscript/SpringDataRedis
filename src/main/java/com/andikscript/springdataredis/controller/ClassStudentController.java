package com.andikscript.springdataredis.controller;

import com.andikscript.springdataredis.model.ClassStudent;
import com.andikscript.springdataredis.service.ClassStudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/class")
public class ClassStudentController {

    private final ClassStudentService classStudentService;

    public ClassStudentController(ClassStudentService classStudentService) {
        this.classStudentService = classStudentService;
    }

    @PostMapping(value = "/add")
    public ResponseEntity<?> addClass(@RequestBody ClassStudent classStudent) {
        classStudentService.addClass(classStudent);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body("created");
    }

    @GetMapping(value = "/all")
    public ResponseEntity<?> getAllClass() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(classStudentService.getAllClass());
    }
}
