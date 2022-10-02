package com.xiaozhi.pkg.override;

public class Person {
  public String name;
  private int age;

  Person(String name,int age) {
    this.name = name;
    this.age = age;
  }

  public int getAge() {
    return  this.age;
  }

  public String Say() {
    return "姓名：" + this.name + "年龄：" + this.age;
  }

}

class Student extends Person {
  public String id;
  private double score;

  Student(String name,int age) {
    super(name,age);
  }

  public void setScore(double score) {
    this.score = score;
  }
  public String say() {
    return "姓名：" + this.name + "年龄：" + this.getAge() + "分数" + this.score;
  }
}
