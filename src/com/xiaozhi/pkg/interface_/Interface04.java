package com.xiaozhi.pkg.interface_;

public class Interface04 {
  public static void main(String[] args) {
      Usb[] usbs = new Usb[2];
      usbs[0] = new MyPhone();
      usbs[1] = new MyCamera();

      for (int i=0;i < usbs.length;i++) {
        usbs[i].work();
        if (usbs[i] instanceof MyPhone) {
          ((MyPhone) usbs[i]).call();
        }
      }
  }
}

interface Usb{
  void work();
}

class MyPhone implements Usb {
  @Override
  public void work() {
    System.out.println("电话正在工作");
  }
  public void call() {
    System.out.println("手机可以打电话");
  }
}

class MyCamera implements Usb {
  @Override
  public void work() {
    System.out.println("相机正在工作");
  }

}
