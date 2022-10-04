package com.xiaozhi.pkg.annotation;

public class Annotation01 {
  public static void main(String[] args) {
    Son son = new Son();
    son.fly();
  }
}

class Father{
  public void fly() {
    System.out.println("father is fly");
  }
}

class Son extends  Father {
  @Override
  public void fly() {
    super.fly();
  }
}
