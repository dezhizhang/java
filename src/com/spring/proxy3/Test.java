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

  @org.junit.jupiter.api.Test
  public void proxyDogTest() {
    Animal dog = new Dog();

    MyProxyProvider myProxyProvider = new MyProxyProvider(dog);

    Animal proxy = myProxyProvider.getProxy();

    proxy.getSum(10,2);
    proxy.getSub(10,2);




  }
}
