package com.xiaozhi.pkg.polyArray;

public class Teacher extends Person{
  private double  salary;
  Teacher(String name,int age,double salary) {
    super(name,age);
    this.salary = salary;
  }

  public void  setSalary(double salary) {
    this.salary = salary;
  }

  public double getSalary() {
    return  this.salary;
  }

  public  String say() {
    return  super.say() + "薪水：" + this.salary;
  }


  public void teach() {
    System.out.println("老师正在教书");
  }

}
