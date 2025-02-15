package com.learning.database.mysqldatabase.service;

import com.learning.database.mysqldatabase.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    Optional<Employee> getEmployee(Integer id);
    Employee updateEmployee(Integer id, Employee employee);
    List<Employee> getAllEmployees();
}
