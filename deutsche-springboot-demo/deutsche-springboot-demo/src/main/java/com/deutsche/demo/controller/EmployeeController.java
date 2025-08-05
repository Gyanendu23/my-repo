package com.deutsche.demo.controller;

import com.deutsche.demo.model.Employee;
import com.deutsche.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emp")
public class EmployeeController {

    @Autowired
    private EmployeeService empService;

    @GetMapping("/getAll")
    public List<Employee> getAllEmployees() {
        return empService.getAllEmployees();
    }

    @GetMapping("/getById/{id}")
    public Employee getEmployeeById(@PathVariable Integer id) {
        return empService.getEmployeeById(id);
    }

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee) {
        return empService.addEmployee(employee);
    }


    @PutMapping("/update")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return empService.updateEmployee(employee);
    }

    @DeleteMapping("/delete/{id}")
    public Employee deleteEmployee(@PathVariable Integer id) {
        return empService.deleteEmployee(id);
    }
}
