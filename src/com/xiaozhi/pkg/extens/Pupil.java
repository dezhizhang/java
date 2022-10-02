package com.xiaozhi.pkg.extens;


class Base {
  public String name;
  public int age;

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }
}

// 小学生
public class Pupil extends Base {
  Pupil(String name,int age) {
    this.setName(name);
    this.setAge(age);
  }
  private double score;

  public void setScore(double score) {
    this.score = score;
  }

  public double getScore() {
    return this.score;
  }

  public void testing() {
    System.out.println("小学生:" + this.name + "年龄：" + this.age + "正在考式中");
  }

  public void  showInfo() {
    System.out.println("小学生:" + this.name + "年龄：" + this.age + "分数：" + this.score);
  }
}

