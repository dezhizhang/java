package com.xiaozhi.desigin.prototype;

import java.io.*;

public class DeepProtoType implements Serializable, Cloneable {
  public String name;
  public DeepCloneableTarget deepCloneableTarget;

  public DeepProtoType() {
    super();

  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    Object deep = null;
    deep = super.clone();
    //对引用类型进行单独处于
    DeepProtoType deepProtoType = (DeepProtoType) deep;
    deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
    return deep;
  }

  public Object deepClone() throws Exception {
    // 创建流对像
    ByteArrayOutputStream bos = null;
    ObjectOutputStream oos = null;
    ByteArrayInputStream bis = null;
    ObjectInputStream ois = null;

    bos = new ByteArrayOutputStream();
    oos = new ObjectOutputStream(bos);
    oos.writeObject(this);

    // 反序列化
    bis = new ByteArrayInputStream(bos.toByteArray());
    ois = new ObjectInputStream(bis);
    DeepProtoType deep = (DeepProtoType) ois.readObject();
    return deep;
  }
}
