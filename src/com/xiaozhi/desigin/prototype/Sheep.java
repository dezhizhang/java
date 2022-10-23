package com.xiaozhi.desigin.prototype;

public class Sheep implements Cloneable {

  private String name;
  private int age;
  private String color;

  public Sheep(String name, int age, String color) {
    super();
    this.name = name;
    this.age = age;
    this.color = color;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  //克隆该实现，使用默认的clone方法来成
  @Override
  protected Object clone() {
    try {
      Sheep sheep = null;
      sheep = (Sheep) super.clone();
      return sheep;
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public String toString() {
    return "Sheep{" + "name='" + name + '\'' + ", age=" + age + ", color='" + color + '\'' + '}';
  }
}
