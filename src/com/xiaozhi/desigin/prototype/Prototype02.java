package com.xiaozhi.desigin.prototype;

public class Prototype02 {
  public static void main(String[] args) throws Exception {
    DeepProtoType deepProtoType = new DeepProtoType();
    deepProtoType.name = "宋江";
    deepProtoType.deepCloneableTarget = new DeepCloneableTarget("大牛", "大牛类");

    DeepProtoType p2 = (DeepProtoType) deepProtoType.clone();

    System.out.println(p2 == deepProtoType);

    System.out.println();

  }
}
