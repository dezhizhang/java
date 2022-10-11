package com.xiaozhi.pkg.reflection;

public class Cat {
  private String name;
  private int age;

  public Cat(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void hi() {
    System.out.println("hi");
  }

  public void eat() {
    System.out.println("猫在吃...");
  }
}
