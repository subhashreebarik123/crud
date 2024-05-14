package com.java.test.repository;

import com.java.test.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepositoryImpl  implements EmployeeRepository{

  @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void print(Employee employee) {
        int update = jdbcTemplate.update("insert into Employee(name,number,salary) values (?,?,?)",
                employee.getName(),employee.getNumber(),employee.getSalary());
    }
}
