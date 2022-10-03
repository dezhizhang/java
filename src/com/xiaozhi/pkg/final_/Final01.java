package com.xiaozhi.pkg.final_;

public class Final01 {
  public static void main(String[] args) {
      AA aa = new AA();
      aa.show();
  }
}

class AA{
  public  final double TAX_RATE;
  public final double TAX_RATE1;
  {
    TAX_RATE1 = 2;
  }

  public AA() {
    TAX_RATE = 1;
  }

  public void  show() {
    System.out.println(TAX_RATE);
    System.out.println(TAX_RATE1);
  }
}

