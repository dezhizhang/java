package com.xiaozhi.pkg.date;

import java.util.Calendar;

public class Date02 {
  public static void main(String[] args) {
    Calendar calendar = Calendar.getInstance();

    System.out.println("年" + calendar.YEAR);
    System.out.println("月:" + calendar.get(Calendar.MONTH));
    System.out.println("日:" + calendar.get(Calendar.DAY_OF_MONTH));
    System.out.println("小时" + calendar.get(Calendar.HOUR));
    System.out.println("分钟：" + calendar.get(Calendar.MINUTE));
    System.out.println("秒：" + calendar.get(Calendar.SECOND));
  }
}
