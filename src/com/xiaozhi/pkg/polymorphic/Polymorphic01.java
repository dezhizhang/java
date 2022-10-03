package com.xiaozhi.pkg.polymorphic;

public class Polymorphic01 {
  public static void main(String[] args) {
    Master master = new Master("tom");
    Dog dog = new Dog("大黄");
    Bone bone = new Bone("大櫸骨");
    master.feed(dog,bone);
  }
}
