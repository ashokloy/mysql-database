package com.learning.database.mysqldatabase.service.impl;

import com.learning.database.mysqldatabase.entity.Employee;
import com.learning.database.mysqldatabase.repository.EmployeeRepo;
import com.learning.database.mysqldatabase.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public Optional<Employee> getEmployee(Integer id) {
        return employeeRepo.findById(id);
    }

    @Override
    public Employee updateEmployee(Integer id, Employee employee) {
        Optional<Employee> employee1 = employeeRepo.findById(id);
        Employee employee2 = employee1.stream().findFirst().orElse(null);
        if(Objects.nonNull(employee2)){
            employee2.setId(employee.getId());
            employee2.setName(employee.getName());
            employee2.setAge(employee.getAge());
            employee2.setSalary(employee.getSalary());
            employee2.setDepartment(employee.getDepartment());
            employee2.setGender(employee.getGender());
            employee2.setYearOfJoining(employee.getYearOfJoining());
            return employeeRepo.save(employee2);
        }
        return null;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }
}
