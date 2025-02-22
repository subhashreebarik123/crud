package com.java.test.repository;

import com.java.test.mapper.EmployeeMapper;
import com.java.test.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepositoryImpl  implements EmployeeRepository{

  @Autowired
    private JdbcTemplate jdbcTemplate;
  @Autowired
  private EmployeeMapper employeeMapper;

    @Override
    public void print(Employee employee) {
        int update = jdbcTemplate.update("insert into Employee(name,number,salary) values (?,?,?)",
                employee.getName(),employee.getNumber(),employee.getSalary());
    }

  @Override
  public Employee getEmployee(int employeeNumber) {
      Employee employee = jdbcTemplate.queryForObject("select name, number, salary from Employee where number=?", new Object[]{employeeNumber}, employeeMapper);
    return employee;
  }

  @Override
  public void deleteEmployee(int employeeNumber) {
      jdbcTemplate.update("delete from Employee where number=?", new Object[]{employeeNumber});

  }

  @Override
  public void updateEmployee(int employeeSalary) {

  }

  @Override
  public void updateEmployee(Employee employee) {
    jdbcTemplate.update("update  Employee set salary='2400' where name =?", new Object[]{employee.getName()});
  }

  //This method is used for update employeeName//
  @Override
  public void updateEmployeeName(String employeeName) {
    jdbcTemplate.update("update Employee set name = 'Jayanti' where number =?" );
  }


}
