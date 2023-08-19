package com.faizal108.sprintboot.hibernate.service;

import com.faizal108.sprintboot.hibernate.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);

    Employee getEmployeeById(long id);

    void deleteEmployee(long id);
}
