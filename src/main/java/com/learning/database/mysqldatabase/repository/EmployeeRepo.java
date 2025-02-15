package com.learning.database.mysqldatabase.repository;

import com.learning.database.mysqldatabase.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
}
