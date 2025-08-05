package com.deutsche.demo.service;

import com.deutsche.demo.model.Employee;
import com.deutsche.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository empRepository;

    public List<Employee> getAllEmployees() {
        return empRepository.findAll();
    }

    public Employee getEmployeeById(Integer id) {
        Optional<Employee> emp = empRepository.findById(id);
        return emp.orElse(null);
    }

    public Employee addEmployee(Employee employee) {
        return empRepository.save(employee);
    }

    public Employee updateEmployee(Employee employee) {
        return empRepository.save(employee);
    }

    public Employee deleteEmployee(Integer id) {
        Optional<Employee> emp = empRepository.findById(id);
        if (emp.isPresent()) {
            empRepository.deleteById(id);
            return emp.get();
        }
        return null;
    }
}
