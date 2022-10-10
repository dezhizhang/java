package com.xiaozhi.pkg.error;

public class Error02 {
  public static void main(String[] args) {
    A b = new B();
    B b2 = (B) b;
    C c1 = (C) b;
    System.out.println(c1);
  }
}

class A {
}

class B extends A {
}

class C extends A {
}
