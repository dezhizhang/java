package com.xiaozhi.adapter;

public class VoltageAdapter extends Voltage220 implements IVoltage5v {
  @Override
  public int output5v() {
    int srcV = output220v();
    int destV = srcV / 44;
    return destV;
  }
}
