package com.xiaozhi.pkg.objStatic;

public class StaticMethod {
  public static void main(String[] args) {

    Student student = new Student("小明");
    Student.payFee(200);

    Student student1 = new Student("小强");
    Student.payFee(200);

    Student.showFee();
  }
}

class Student {
  private String name;
  private static double fee = 0;

  Student(String name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public static void payFee(double fee) {
    Student.fee += fee;
  }

  public static void showFee() {
    System.out.println("总学费为：" + Student.fee);
  }
}


