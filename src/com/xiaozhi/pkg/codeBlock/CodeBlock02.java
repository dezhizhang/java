package com.xiaozhi.pkg.codeBlock;

public class CodeBlock02 {
  public static void main(String[] args) {
    System.out.println(DD.n1);
  }
}

class DD {
  public static int n1 = 888;

  static {
    System.out.println("DD的静态代码块被执行....");
  }

  {
    System.out.println("DD的普通代码块....");
  }
}


