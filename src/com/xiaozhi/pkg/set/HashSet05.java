package com.xiaozhi.pkg.set;

import java.util.HashSet;
import java.util.Objects;

public class HashSet05 {
  public static void main(String[] args) {
    HashSet hashSet = new HashSet();
    hashSet.add(new Employee("小明", 18));
    hashSet.add(new Employee("小明", 18));
    hashSet.add(new Employee("小强", 22));

    System.out.println(hashSet);
  }
}

class Employee {
  private String name;
  private int age;

  public Employee(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Employee{" + "name='" + name + '\'' + ", age=" + age + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Employee employee)) return false;
    return getAge() == employee.getAge() && Objects.equals(getName(), employee.getName());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getName(), getAge());
  }
}


