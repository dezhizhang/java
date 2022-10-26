package com.xiaozhi.decorator;

public class Milk extends Decorator {
  public Milk(Drink obj) {
    super(obj);
    setDes("牛奶");
    setPrice(3.0f);
  }
}
