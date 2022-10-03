package com.xiaozhi.pkg.polyParameter;

public class Person extends Employee {
  Person(String name, double salary) {
    super(name, salary);

  }

  public void work() {
    System.out.println("员工:" + this.getName() + "正在工作...");
  }

  public double getAnnual() {
    return super.getAnnual();
  }
}
