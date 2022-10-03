package com.xiaozhi.pkg.objectpoly;

public class ObjectPoly {
  public static void main(String[] args) {
    Animal animal = new Dog();
    animal.cry();

    animal = new Cat();
    animal.cry();
  }
}
