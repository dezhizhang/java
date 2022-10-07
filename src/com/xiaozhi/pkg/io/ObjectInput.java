package com.xiaozhi.pkg.io;

import java.io.*;

public class ObjectInput  {
  public static void main(String[] args) throws IOException {
    String filePath = "./data.dat";
    ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));
//    System.out.println(ois.readInt());
    System.out.println(ois.readBoolean());
    System.out.println(ois.readChar());
    System.out.println(ois.readDouble());
    System.out.println(ois.readUTF());

    ois.close();

  }
}
