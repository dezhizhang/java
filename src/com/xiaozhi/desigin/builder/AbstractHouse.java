package com.xiaozhi.desigin.builder;

public abstract class AbstractHouse {
  //打地基
  public abstract void buildBasic();

  //砌墙
  public abstract void BuildWalls();

  //封顶
  public abstract void roofed();

  public void build() {
    buildBasic();
    BuildWalls();
    roofed();

  }
}
