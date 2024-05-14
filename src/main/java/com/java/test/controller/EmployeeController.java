package com.java.test.controller;

import com.java.test.model.Employee;
import com.java.test.repository.EmployeeRepositoryImpl;
import com.java.test.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeServiceImpl employeeServiceimpl;

   @PostMapping ("/createEmployee")
    public String createEmployee(@RequestBody Employee employee) {
       employeeServiceimpl.display(employee);
       return "Employee is Succesfully Created";
   }
}
