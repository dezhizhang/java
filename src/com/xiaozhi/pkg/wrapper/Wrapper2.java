package com.xiaozhi.pkg.wrapper;

public class Wrapper2 {
  public static void main(String[] args) {
    // 包装类型转string
    Integer i = 100;
    String str = i + "";
    System.out.println(str);
    System.out.println(i.toString());
    System.out.println(String.valueOf(i));

    // 字符串转成包装类
    String str1 = "123456";
    System.out.println(Integer.parseInt(str1));
    System.out.println(new Integer(str1));
  }
}
