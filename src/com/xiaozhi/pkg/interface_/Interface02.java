package com.xiaozhi.pkg.interface_;

public class Interface02 {
  public static void main(String[] args) {
    Pig pig = new Pig();
    pig.hi();
    pig.say();
    System.out.println(IB.n1);
  }
}

interface IB {
  //接口中的属性，只能是final的，而且是public static final修饰
  int n1 = 10;
  void hi();
}

interface IC {
  void say();
}

class Pig implements IB, IC {

  @Override
  public void hi() {
    System.out.println("hi");
  }

  @Override
  public void say() {
    System.out.println("say");
  }
}


