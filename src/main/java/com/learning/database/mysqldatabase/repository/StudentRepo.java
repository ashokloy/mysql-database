package com.learning.database.mysqldatabase.repository;

import com.learning.database.mysqldatabase.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {
}
