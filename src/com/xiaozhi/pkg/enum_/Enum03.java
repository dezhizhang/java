package com.xiaozhi.pkg.enum_;

public class Enum03 {
  public static void main(String[] args) {
    Gender boy = Gender.BOY;
    Gender boy2 = Gender.BOY;

    System.out.println(boy);
    System.out.println(boy2 == boy);
  }
}


enum Gender{
  BOY,GIRL
}




