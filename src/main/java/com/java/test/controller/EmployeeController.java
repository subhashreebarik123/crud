package com.java.test.controller;

import com.java.test.model.Employee;
import com.java.test.repository.EmployeeRepositoryImpl;
import com.java.test.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeServiceImpl employeeServiceimpl;

   @PostMapping ("/createEmployee")
    public String createEmployee(@RequestBody Employee employee) {
       employeeServiceimpl.display(employee);
       return "Employee is Succesfully Created";
   }

    @GetMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable int id){
        return  employeeServiceimpl.getEmployee(id);
    }

    @DeleteMapping("/employee/{id}")
    public String deleteEmployee(@PathVariable  int id){
       employeeServiceimpl.deleteEmployee(id);

       return "Employee deleted having employee id:" + id;
   }
   @PutMapping("/employee/update")
    public String  updateEmployee(@RequestBody Employee employee) {
        employeeServiceimpl.updateEmployee(employee);
        return "Employee updated:"+employee.getName();

   }
   @PutMapping("/employee/update")
    public String updateEmployeeName(@RequestBody String employeeName){
       employeeServiceimpl.updateEmplyeeName(employeeName);
       return "Employee updated :"+employeeName;
   }

   }




