package com.learning.database.mysqldatabase.controller;

import com.learning.database.mysqldatabase.entity.Employee;
import com.learning.database.mysqldatabase.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/saveEmployee")
    ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
        return ResponseEntity.ok(employeeService.saveEmployee(employee));
    }

    @GetMapping("/getEmployee/{id}")
    ResponseEntity<Optional<Employee>> getEmployee(@PathVariable Integer id){
        return ResponseEntity.ok(employeeService.getEmployee(id));
    }

    @PutMapping("/updateEmployee")
    ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee, @RequestParam Integer id){
        return ResponseEntity.ok(employeeService.updateEmployee(id, employee));
    }

    @GetMapping("/getAll")
    ResponseEntity <?> getAllEmployee(){
        List<Employee> listEmp = employeeService.getAllEmployees();
        Map<Integer, List<Employee>> empMap = listEmp.stream().collect(Collectors.groupingBy(Employee::getAge, TreeMap::new, Collectors.toList()));
        return ResponseEntity.ok(empMap);
    }
}
