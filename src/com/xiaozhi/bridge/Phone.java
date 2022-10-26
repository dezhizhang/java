package com.xiaozhi.bridge;

public abstract class Phone {
  private Brand brand;

  public Phone(Brand brand) {
    super();
    this.brand = brand;
  }

  protected void open() {
    this.brand.open();
  }

  protected void close() {
    this.brand.close();
  }

  protected void call() {
    this.brand.call();
  }
}
