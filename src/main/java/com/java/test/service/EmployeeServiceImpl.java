package com.java.test.service;

import com.java.test.model.Employee;
import com.java.test.repository.EmployeeRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Service
public class EmployeeServiceImpl implements  EmployeeService {

  @Autowired
  EmployeeRepositoryImpl employeeRepositoryImpl;


  @Override
  public void display(Employee employee) {
    employeeRepositoryImpl.print(employee);
  }

  @Override
  public Employee getEmployee(int employeeNumber) {
    return employeeRepositoryImpl.getEmployee(employeeNumber);
  }

  @Override
  public void deleteEmployee(int employeeNumber) {
     employeeRepositoryImpl.deleteEmployee(employeeNumber);

  }

}