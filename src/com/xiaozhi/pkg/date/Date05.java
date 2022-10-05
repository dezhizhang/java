package com.xiaozhi.pkg.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date05 {
  public static void main(String[] args) {

    LocalDateTime ldt = LocalDateTime.now();
    LocalDateTime nLdt = ldt.plusDays(360);

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY年MM月dd日 HH小时mm分钟ss秒");
    System.out.println(dtf.format(nLdt));

  }
}
