package com.xiaozhi.pkg.polymorphic;

public class Animal {
  private String name;
  Animal(String name) {
    setName(name);
  }
  public String getName() {
    return  this.name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
