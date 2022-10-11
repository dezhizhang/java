package com.xiaozhi.pkg.error;

public class Error05 {
  public static void main(String[] args) {
    int age = 140;
    if (!(age >= 18 && age <= 120)) {
      throw new AgeException("年龄需要在18-120之间");
    }
    System.out.println("程序正常运行");
  }
}

class AgeException extends RuntimeException {
  public AgeException(String message) {
    super(message);
  }
}
