package com.xiaozhi.pkg.date;

import java.time.LocalDateTime;

public class Date03 {
  public static void main(String[] args) {
    LocalDateTime ldt = LocalDateTime.now();
    System.out.println(ldt);
    System.out.println("年：" + ldt.getYear());
    System.out.println("月:" + ldt.getMonthValue());
    System.out.println("月:" + ldt.getMonth());
    System.out.println("日：" + ldt.getDayOfMonth());
    System.out.println("时：" + ldt.getMinute());
    System.out.println("秒：" + ldt.getSecond());
  }
}
