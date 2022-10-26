package com.xiaozhi.decorator;

public class Decorator extends Drink {
  private Drink obj;

  public Decorator(Drink obj) {
    this.obj = obj;
  }

  @Override
  public float cost() {
    return super.getPrice() + obj.getPrice();
  }

  public String getDes() {
    return super.getDes() + "" + super.getDes() + "&&" + obj.getDes();
  }
}
