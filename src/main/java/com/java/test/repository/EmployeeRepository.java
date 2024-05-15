package com.java.test.repository;

import com.java.test.model.Employee;

public interface EmployeeRepository {

    void print (Employee employee);

    Employee getEmployee(int employeeNumber);

    void deleteEmployee(int employeeNumber);
}
