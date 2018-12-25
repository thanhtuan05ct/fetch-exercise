package com.fetch.exercise.controller;

import com.fetch.exercise.entity.Employee;
import com.fetch.exercise.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by tuanle on 24/12/2018.
 */
@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity getAllEmployees() {
        return new ResponseEntity(employeeService.getAllEmployees(), HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity getById(@PathVariable("id") Long id) {
        return new ResponseEntity(employeeService.getEmployeeById(id), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity createEmployee(@Valid @RequestBody Employee employee) {
        return new ResponseEntity(employeeService.createEmployee(employee), HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity updateEmployee(@PathVariable("id") Long id,
                                         @Valid @RequestBody Employee employee) {

        return new ResponseEntity(employeeService.updateEmployee(id, employee), HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity deleteEmployee(@PathVariable("id") Long id) {
        employeeService.deleteEmployeeById(id);
        return new ResponseEntity(id + " have been deleted", HttpStatus.OK);
    }
}
