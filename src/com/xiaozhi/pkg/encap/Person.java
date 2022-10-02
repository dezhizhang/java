package com.xiaozhi.pkg.encap;

public class Person {
  public String name;
  private int age;
  private double salary;
  public Person() {

  }

  public Person(String name,int age,double salary) {
    this.setName(name);
    this.setAge(age);
    this.setSalary(salary);
  }

  public void setName(String name) {
    if(name.length() <2 || name.length() >=6) {
      System.out.println("输入不合法");
      return;
    }
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
