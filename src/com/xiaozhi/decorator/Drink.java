package com.xiaozhi.decorator;

public abstract class Drink {
  public String des; // 描述
  private float price = 0.0f;

  public String getDes() {
    return this.des;
  }

  public float getPrice() {
    return this.price;
  }

  public void setDes(float price) {
    this.price = price;
  }

  // 计算费用的抽象方法
  public abstract float cost();

}
