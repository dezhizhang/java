package com.xiaozhi.pkg.date;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date04 {
  public static void main(String[] args) {
    LocalDateTime ldt = LocalDateTime.now();

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY年MM月dd日 HH小时mm分钟ss秒");

    System.out.println(dtf.format(ldt));


    Instant now = Instant.now();
    System.out.println(now);

  }
}
