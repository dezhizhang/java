package com.tower.serice;

import com.tower.dao.EmployeeDao;
import com.tower.domain.Employee;

public class EmployService {
  private EmployeeDao employeeDao = new EmployeeDao();

  public Employee getEmployeeByIdAndName(Integer empId, String password) {

    String sql = "select * from employee where empId=? and password=?";

    Employee employee = employeeDao.querySingle(sql, Employee.class, empId, password);
    return employee;

  }
}
