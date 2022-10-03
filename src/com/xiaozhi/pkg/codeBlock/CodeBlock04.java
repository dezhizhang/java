package com.xiaozhi.pkg.codeBlock;

public class CodeBlock04 {
  public static void main(String[] args) {
    AAA aaa = new AAA(); //1BBB的无参构造器2AAA的普通代码块3AAA的无数构造器
  }
}

class BBB{
  {
    System.out.println("BBB的普通代码块");
  }
  BBB() {
    System.out.println("BBB的无参构造器");
  }
}

class  AAA extends BBB{
  {
    System.out.println("AAA的普通代码块");
  }
  AAA() {
    System.out.println("AAA的无参构造器");
  }
}
