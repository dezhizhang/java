package com.xiaozhi.pkg.polymorphic;

public class Master {
  private String name;

  Master(String name) {
    setName(name);
  }

  public void  setName(String name) {
    this.name = name;
  }

  public String getName() {
    return  this.name;
  }

  public void feed(Animal animal,Food food) {
    System.out.println("主人：" + this.name + "给" + animal.getName() + "吃" + food.getName());
  }

}
