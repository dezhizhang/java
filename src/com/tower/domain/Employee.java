package com.tower.domain;

public class Employee {
  private Integer id;
  private Integer empId;
  private String name;
  private String password;
  private String job;

  public Employee() {

  }

  public Employee(Integer id, Integer empId, String name, String password, String job) {
    this.id = id;
    this.empId = empId;
    this.password = password;
    this.name = name;
    this.job = job;

  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getId() {
    return id;
  }

  public Integer getEmpId() {
    return empId;
  }

  public void setEmpId(Integer empId) {
    this.empId = empId;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getPassword() {
    return password;
  }

  public void setJob(String job) {
    this.job = job;
  }

  public String getJob() {
    return job;
  }
}
