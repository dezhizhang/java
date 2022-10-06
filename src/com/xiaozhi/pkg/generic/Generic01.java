package com.xiaozhi.pkg.generic;

import java.util.ArrayList;

public class Generic01 {
  public static void main(String[] args) {
    ArrayList<Dog> arrayList = new ArrayList<Dog>();
    arrayList.add(new Dog("阿黄",22));
    arrayList.add(new Dog("大黄",33));

    for (Dog dog:arrayList) {
      System.out.println(dog.getName());
    }
  }
}
