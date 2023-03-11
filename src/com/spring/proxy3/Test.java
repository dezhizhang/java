package com.spring.proxy3;

public class Test {

  @org.junit.jupiter.api.Test
  public void dogTest() {
    Dog dog = new Dog();
    dog.getSum(10,2);
    System.out.println("===========");
    dog.getSub(10,2);
    System.out.println("===========");

  }
}
