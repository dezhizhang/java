package com.xiaozhi.pkg.wrapper;

public class Wrapper4 {
  public static void main(String[] args) {
     Integer n = 1;
     Integer m = 1;
     System.out.println(m == n); //true

     Integer x = 128;
     Integer y = 128;
     System.out.println(x == y); //false
  }
}
