package com.xiaozhi.pkg.codeBlock;

public class CodeBlock02 {
  public static void main(String[] args) {
    // 如果使用类的静态面员，普通代码块不会执行
    System.out.println(DD.n1);
  }
}

class DD{
  public static int n1 = 8888;

  static {
    System.out.println("DD的静态代码块被执行....");
  }
  {
    System.out.println("DD的普通代码块....");
  }
}


