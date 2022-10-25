package com.xiaozhi.improve;

public class CommonHouse extends HouseBuilder {
  @Override
  public void buildBasic() {
    System.out.println("普通房子打地基");
  }

  @Override
  public void buildWalls() {
    System.out.println("普通房子砌培");
  }

  @Override
  public void roofed() {

  }
}
