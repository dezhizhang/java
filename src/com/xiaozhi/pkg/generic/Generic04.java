package com.xiaozhi.pkg.generic;

import java.util.ArrayList;

public class Generic04 {
  public static void main(String[] args) {
    ArrayList<Employee> employees = new ArrayList<>();
    employees.add(new Employee("tom",1000,new MyData(2010,10,10)));
    employees.add(new Employee("tom",1000,new MyData(2010,10,10)));
    employees.add(new Employee("tom",1000,new MyData(2010,10,10)));

  }
}

class Employee {
  private String name;
  private double sal;
  private MyData birthday;

  Employee(String name, double sal, MyData birthday) {
    this.name = name;
    this.sal = sal;
    this.birthday = birthday;
  }

  public String getName() {
    return this.name;
  }

  public double getSal() {
    return this.sal;
  }

  public MyData getBirthday() {
    return birthday;
  }
}

class MyData implements Comparable<MyData> {
  private int year;
  private int month;
  private int day;

  public MyData(int year, int month, int day) {
    this.year = year;
    this.month = month;
    this.day = day;
  }

  public int getYear() {
    return this.year;
  }

  public int getMonth() {
    return this.month;
  }

  public int getDay() {
    return this.day;
  }

  @Override
  public int compareTo(MyData o) {
    return 0;
  }
}


