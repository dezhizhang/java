package com.xiaozhi.pkg.string;

public class String1 {
  public static void main(String[] args) {
      String a = "hsp";
      String b = new String("hsp");

      System.out.println(a == b.intern()); //true
      System.out.println(b == b.intern()); //false
  }
}


