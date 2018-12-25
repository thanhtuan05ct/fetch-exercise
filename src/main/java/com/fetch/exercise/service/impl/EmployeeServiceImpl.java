package com.fetch.exercise.service.impl;

import com.fetch.exercise.entity.Employee;
import com.fetch.exercise.repository.EmployeeRepository;
import com.fetch.exercise.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by tuanle on 24/12/2018.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        employeeRepository.findAll().forEach(employee -> employees.add(employee));
        return employees;
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(Long id, Employee employee) {
        Optional<Employee> employeeOptional = employeeRepository.findById(id);
        if (!employeeOptional.isPresent())
            return null;
        employee.setId(id);
        employeeRepository.save(employee);
        return employee;
    }

    @Override
    public void deleteEmployeeById(Long id) {
        employeeRepository.deleteById(id);
    }
}
