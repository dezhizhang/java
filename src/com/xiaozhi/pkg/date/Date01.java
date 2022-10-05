package com.xiaozhi.pkg.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date01 {
  public static void main(String[] args) throws Exception {
    Date date = new Date();
    System.out.println("当前时间=" + date);
    System.out.println(date.getTime());

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY年MM月dd日 hh:mm:ss E");
    System.out.println(simpleDateFormat.format(date));

    String str = "2022年10月05日 10:31:02 周三";
    System.out.println(simpleDateFormat.format(simpleDateFormat.parse(str)));

  }
}
