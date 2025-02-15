package com.learning.database.mysqldatabase.service.impl;

import com.learning.database.mysqldatabase.entity.Student;
import com.learning.database.mysqldatabase.repository.StudentRepo;
import com.learning.database.mysqldatabase.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepo studentRepo;

    public Student saveDetails(Student student){
        return studentRepo.save(student);
    }

    @Override
    public Optional<Student> getStudent(Integer id) {
        return studentRepo.findById(id);
    }

    @Override
    public void deleteStudent(Integer id) {
        studentRepo.deleteById(id);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepo.saveAndFlush(student);
    }
}

