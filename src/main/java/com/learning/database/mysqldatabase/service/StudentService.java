package com.learning.database.mysqldatabase.service;

import com.learning.database.mysqldatabase.entity.Student;

import java.util.Optional;

public interface StudentService {
    Student saveDetails(Student student);
    Optional<Student> getStudent(Integer id);
    void deleteStudent(Integer id);
    Student updateStudent(Student student);
}
