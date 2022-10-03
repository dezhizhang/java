package com.xiaozhi.pkg.codeBlock;

public class CodeBlock03 {
  public static void main(String[] args) {
    Aa a = new Aa();
    //A 的静态代码块
    //getN1被调用...
  }
}

class  Aa{
  private  static int n1 = getN1();
  private int n2 = getN2();
  static {
    System.out.println("A 的静态代码块");
  }
  {
    System.out.println("的静态代码块");
  }

  public static int getN2() {
    System.out.println("getN2被调用...");
    return 200;
  }
  public static int getN1() {
    System.out.println("getN1被调用...");
    return 100;
  }
}



