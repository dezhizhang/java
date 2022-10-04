package com.xiaozhi.pkg.exception;

public class Exception01 {
  public static void main(String[] args) {

    try {
      int num1 = 10;
      int num2 = 0;
      int res = num1 / num2;
    }catch (Exception e) {
      //e.printStackTrace();
      System.out.println(e.getMessage());
    }

    System.out.println("程序继续运行...");
  }
}
