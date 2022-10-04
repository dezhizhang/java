package com.xiaozhi.pkg.enum_;

public class Enum01 {
  public static void main(String[] args) {
      System.out.println(Season.AUTUMN);
  }
}


class Season {
  private String name;
  private String desc;

  public final static Season SPRING = new Season("春天", "温暖");
  public final static Season WINTER = new Season("冬天", "実冷");
  public final static Season AUTUMN = new Season("秋天", "凉爽");
  public final static Season SUMMER = new Season("夏天", "炎热");


  private Season(String name, String desc) {
    this.name = name;
    this.desc = desc;
  }

  public String getName() {
    return this.name;
  }

}
