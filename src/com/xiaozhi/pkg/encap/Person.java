package com.xiaozhi.pkg.encap;

public class Person {
  public String name;
  private int age;
  private double salary;

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return  this.name;
  }

  public int getAge() {
    return  this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public double getSalary() {
    return  this.salary;
  }

  public void  setSalary(double salary) {
    this.salary = salary;
  }

  public  String info() {
    return  "信息为 name=" + this.name + "age= " + this.age + "薪水= " + this.salary;
  }



}
