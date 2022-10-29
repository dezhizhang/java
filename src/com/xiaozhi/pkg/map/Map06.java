package com.xiaozhi.pkg.map;

import java.util.*;

public class Map06 {
  public static void main(String[] args) {
    Map map = new HashMap();

    map.put(1, new Employee("jack", 1, 20, 3000));
    map.put(1, new Employee("tom", 2, 20, 20000));
    map.put(1, new Employee("mack", 3, 30, 18000));


    Set set1 = map.keySet();
    for (Object key : set1) {
      Employee employee = (Employee) map.get(key);
      if (employee.getSalary() > 1800) {
        System.out.println(employee);
      }
    }


    Set set = map.entrySet();
    Iterator iterator = set.iterator();

    while (iterator.hasNext()) {
      Map.Entry entry = (Map.Entry) iterator.next();
      Employee employee = (Employee) entry.getValue();
      if (employee.getSalary() > 1800) {
        System.out.println(employee);
      }
    }

  }
}


class Employee {
  private String name;
  private int age;

  private int id;
  private double salary;

  public Employee(String name, int id, int age, double salary) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.salary = salary;

  }

  public void setId(int id) {
    this.id = id;
  }

  public int getId() {
    return id;
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
    return "Employee{" + "name='" + name + '\'' + ", age=" + age + ", id=" + id + ", salary=" + salary + '}';
  }
}


