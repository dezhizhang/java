package com.xiaozhi.pkg.math;

public class Math01 {
  public static void main(String[] args) {
    //1 Math.abs 求约对值
    int abs = Math.abs(-9);
    System.out.println(abs);

    //2 Math.pow求幂
    double pow = Math.pow(2, 4);
    System.out.println(pow);

    //3 Math.ceil向上取整
    double ceil = Math.ceil(-3.0001);
    System.out.println(ceil);

    //4 Math.floor向下取整
    double floor = Math.floor(-4.999);
    System.out.println(floor);

    //5 Math.round四舍五入
    long round = Math.round(-5.0001);
    System.out.println(round);

    //6 Math.sqrt求平方
    double sqrt = Math.sqrt(9.0);
    System.out.println(sqrt);

    //7 Math.random()生成随面数
    double random = Math.random();
    System.out.println(random);

    //生成随面数
    int a = 2;
    int b = 7;

    for (int i = 0; i < 10; i++) {
      int random1 = (int) (a + Math.random() * (b - a + 1));
      System.out.println(random1);
    }

    int max = 10;
    int min = 1;
    System.out.println(Math.max(max,min));
    System.out.println(Math.min(max,min));
  }
}


