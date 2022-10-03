package com.xiaozhi.pkg.polyArray;

public class Student extends Person {
  private double score;

  Student(String name, int age, double score) {
    super(name, age);
    this.score = score;
  }

  public void setScore(double score) {
    this.score = score;
  }

  public double getScore() {
    return this.score;
  }

  public String say() {
    return super.say() + "分数：" + this.score;
  }

  public void study() {
    System.out.println("学生正在学习");
  }
}
