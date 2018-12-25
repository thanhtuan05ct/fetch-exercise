package com.fetch.exercise.repository;

import com.fetch.exercise.entity.Employee;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by tuanle on 24/12/2018.
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
