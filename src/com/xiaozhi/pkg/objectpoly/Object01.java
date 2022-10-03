package com.xiaozhi.pkg.objectpoly;

public class Object01 {
  public static void main(String[] args) {
    A a = new A();
    A b = a;
    A c = b;

    System.out.println(a == c);
    System.out.println(b == c);

  }
}

class  A {

}
