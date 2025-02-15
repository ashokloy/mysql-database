package com.learning.database.mysqldatabase.controller;

import com.learning.database.mysqldatabase.entity.Student;
import com.learning.database.mysqldatabase.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentServiceImpl studentService;

    @PostMapping("/saveStudent")
    public ResponseEntity<Student> postDetails(@RequestBody Student student){
        return ResponseEntity.ok(studentService.saveDetails(student));
    }

    @GetMapping("/getStudent/{id}")
    public Optional<Student> getStudent(@PathVariable Integer id){
        return studentService.getStudent(id);
    }

}
