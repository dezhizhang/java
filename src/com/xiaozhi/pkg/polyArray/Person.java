package com.xiaozhi.pkg.polyArray;

public class Person {
  private String name;
  private int age;
  Person(String name,int age) {
    this.name = name;
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }
  public String getName() {
    return  this.name;
  }

  public void setAge(int age) {
    this.age = age;
  }
  public int getAge() {
    return  this.age;
  }

  public String say() {
    return  "姓名：" + this.name + "年龄：" + this.age;
  }

}
