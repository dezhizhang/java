package com.xiaozhi.pkg.wrapper;

public class Wrapper1 {
  public static void main(String[] args) {
    Object obj1 = true ? new Integer(1): new Double(2.0);
    System.out.println(obj1);
  }
}
