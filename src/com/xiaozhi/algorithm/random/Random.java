package com.xiaozhi.algorithm.random;

public class Random {
  public static void main(String[] args) {
    System.out.println(f());
  }


  public static int f() {
    return (int)(Math.random() * 5) + 1;
  }

  public static int f2() {
    int ans = 0;
    do {
      ans = f();
    }while (ans == 3);
    return ans < 3 ? 0:1;
  }
}
