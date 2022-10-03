package com.xiaozhi.pkg.objStatic;

public class StaticDetail {
  public static void main(String[] args) {
     B b = new B();
     System.out.println(b.n2);
  }
}

class B {
  public static int n2 = 100;
}
