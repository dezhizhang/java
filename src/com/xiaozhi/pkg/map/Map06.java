package com.xiaozhi.pkg.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Map06 {
  public static void main(String[] args) {
    Map map = new HashMap();


  }
}


class Employee {
  private String name;
  private int age;
  private double salary;

  public Employee(String name, int age, double salary) {
    this.name = name;
    this.age = age;
    this.salary = salary;

  }

  public double getSalary() {
    return salary;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Employee employee)) return false;
    return getAge() == employee.getAge() && Double.compare(employee.getSalary(), getSalary()) == 0 && Objects.equals(getName(), employee.getName());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getName(), getAge(), getSalary());
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return super.toString();
  }
}


