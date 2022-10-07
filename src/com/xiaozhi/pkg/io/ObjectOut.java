package com.xiaozhi.pkg.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectOut {
  public static void main(String[] args) {
    String filePath = "./data.dat";

    try{
      ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));
//      oos.writeInt(10);
      oos.writeBoolean(true);
      oos.writeChar('A');
      oos.writeDouble(9.4);
      oos.writeUTF("晓智云");
    }catch (IOException e) {
      e.printStackTrace();
    }

  }
}

class Dog implements Serializable {
  private String name;
  private int age;
  public Dog(String name,int age) {
    this.name = name;
    this.age = age;
  }
}
