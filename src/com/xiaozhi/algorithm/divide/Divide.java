package com.xiaozhi.algorithm.divide;

public class Divide {
  public static void main(String[] args) {
    tower(64,'A','B','C');
  }

  public static void tower(int num, char a, char b, char c) {
    if (num == 1) {
      System.out.println("第1个盘从" + a + "->" + c);
    } else {
      tower(num - 1, a, c, b);
      System.out.println("第" + num + "个盘从" + a + "->" + c);
      tower(num - 1, b, a, c);
    }
  }
}


