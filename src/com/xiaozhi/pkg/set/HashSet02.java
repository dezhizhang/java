package com.xiaozhi.pkg.set;

import java.util.HashSet;

public class HashSet02 {
  public static void main(String[] args) {
    HashSet hashSet = new HashSet();
    hashSet.add(new Dog1("阿黄1"));
    hashSet.add(new Dog1("阿黄2"));

    System.out.println(hashSet);
  }
}

class Dog1 {
  private String name;

  public Dog1(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Dog1{" + "name='" + name + '\'' + '}';
  }
}
