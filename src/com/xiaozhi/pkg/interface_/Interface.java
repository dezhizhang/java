package com.xiaozhi.pkg.interface_;

public class Interface {
  public static void main(String[] args) {
      Phone phone = new Phone();
      Camera camera = new Camera();

      Computer computer = new Computer();
      computer.work(phone);
      computer.work(camera);
  }
}

class Computer{
  public void work(UsbInterface usbInterface) {
    usbInterface.start();
    usbInterface.stop();
  }
}


class Phone implements UsbInterface {
  @Override
  public void start() {
    System.out.println("手机开始工作");
  }

  @Override
  public void stop() {
    System.out.println("手机停止工作");
  }
}

class Camera implements UsbInterface {
  @Override
  public void start() {
    System.out.println("相机开始工作");
  }

  @Override
  public void stop() {
    System.out.println("相机停止工作");
  }
}

