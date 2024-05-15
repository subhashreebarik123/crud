package com.java.test.service;

import com.java.test.model.Employee;

public interface EmployeeService {

     void display(Employee employee);

     Employee getEmployee(int employeeNumber);

     void deleteEmployee (int employeeNumber);
}
