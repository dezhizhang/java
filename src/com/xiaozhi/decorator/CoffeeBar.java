package com.xiaozhi.decorator;

public class CoffeeBar {
  public static void main(String[] args) {
    //一份订单
    Drink order = new LongBlack();
    System.out.println(order.cost());
    System.out.println(order.getDes());

    //加入一份牛奶
    order = new Milk(order);

    System.out.println(order.cost());
    System.out.println(order.getDes());

    order = new Chocolate(order);
    System.out.println(order.cost());
    System.out.println(order.getDes());
  }
}
