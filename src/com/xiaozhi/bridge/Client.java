package com.xiaozhi.bridge;

public class Client {
  public static void main(String[] args) {
    Phone phone = new FoldPhone(new XiaoMi());

    phone.open();
    phone.call();
    phone.call();
  }
}
