package com.xiaozhi.pkg.enum_;

public class Enum04 {
  public static void main(String[] args) {
    Week[] weeks = Week.values();
    for (int i = 0; i < weeks.length; i++) {
      System.out.println(weeks[i]);
    }
  }
}

enum Week {
  MONDAY("星期一"),
  TUESDAY("星期二"),
  WEDNESDAY("星期三"),
  THURSDAY("星期四"),
  FRIDAY("星期五"),
  SATURDAY("星期六"),
  SUNDAY("星期日");
  private String name;
  Week(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return this.name;
  }
}



