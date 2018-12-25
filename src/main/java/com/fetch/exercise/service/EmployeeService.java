package com.fetch.exercise.service;

import com.fetch.exercise.entity.Employee;

import java.util.List;

/**
 * Created by tuanle on 24/12/2018.
 */
public interface EmployeeService {

    List<Employee> getAllEmployees();
    Employee getEmployeeById(Long id);
    Employee createEmployee(Employee employee);
    Employee updateEmployee(Long id, Employee employee);
    void deleteEmployeeById(Long id);
}
