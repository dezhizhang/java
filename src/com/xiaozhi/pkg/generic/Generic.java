package com.xiaozhi.pkg.generic;

import java.util.ArrayList;
import java.util.List;

public class Generic {
  public static void main(String[] args) {
    List list = new ArrayList();
    list.add(new Dog("旺财",10));
    list.add(new Dog("阿黄",2));

    for (Object o :list) {
      System.out.println(((Dog) o).getName());
    }
  }
}

class Dog{
  private String name;
  private int age;
  public Dog(String name,int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return  this.name;
  }

  public int getAge() {
    return this.age;
  }
}
