package com.xiaozhi.pkg.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection4 {
  public static void main(String[] args) {
    List list = new ArrayList();
    list.add(new Dog("小黄",2));
    list.add(new Dog("大黄",4));
    list.add(new Dog("阿黄",8));

    Iterator iterator = list.iterator();
    while (iterator.hasNext()) {
      Object next = iterator.next();
      System.out.println(next);
    }

    for(Object dog:list) {
      System.out.println(dog);
    }
  }
}

class Dog {
  private String name;
  private int age;
  Dog(String name,int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return this.name + this.age;
  }
}



