package com.xiaozhi.desigin.prototype;

public class Prototype01 {
  public static void main(String[] args) {
    Sheep sheep = new Sheep("tom", 1, "白色");
    Sheep sheep1 = (Sheep) sheep.clone();

    System.out.println(sheep1 == sheep);

    System.out.println(sheep1.toString());
  }
}
