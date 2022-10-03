package com.xiaozhi.pkg.polymorphic;

public class Food {
  private String name;

  Food(String name) {
    this.setName(name);
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return  this.name;
  }
}
