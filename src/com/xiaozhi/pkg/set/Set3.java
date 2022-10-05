package com.xiaozhi.pkg.set;

import java.util.HashSet;

public class Set3 {
  public static void main(String[] args) {
    HashSet hashSet = new HashSet();
    hashSet.add("lucy");
    hashSet.add("lucy");
    hashSet.add(new Dog("tom"));
    hashSet.add(new Dog("tom"));

    System.out.println(hashSet);

  }
}

class Dog{
  private String name;
  public Dog(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return this.name;
  }
}
