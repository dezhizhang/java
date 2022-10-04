package com.xiaozhi.pkg.enum_;

public class Enum02 {
  public static void main(String[] args) {
        System.out.println(Season2.WINTER);
  }
}

enum Season2{
  SPRING("春天", "温暖"),
  WINTER("冬天", "実冷"),
  AUTUMN("秋天", "凉爽"),
  SUMMER("夏天", "炎热");

  private String name;
  private String desc;
  Season2(String name,String desc) {
    this.name = name;
    this.desc = desc;
  }
  public String toString(){
    return this.desc;
  }

}



