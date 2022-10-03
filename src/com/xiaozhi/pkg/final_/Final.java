package com.xiaozhi.pkg.final_;

public class Final {
  public static void main(String[] args) {
    A a = new A();
    System.out.println(A.TAX_MAX);
  }
}

final class A{
  final public static double TAX_MAX = 0.08;
  public void  hi() {
    final double NUM = 0.9;
//    NUM = NUM *0.2;
    System.out.println(NUM);
  }
}
