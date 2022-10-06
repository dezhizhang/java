package com.xiaozhi.pkg.io;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.function.Try;

import java.io.FileOutputStream;
import java.io.IOException;

public class Io05 {
  public static void main(String[] args) {

  }
  @Test
  public void  write() {

    String filePath = "./hello.txt";
    FileOutputStream fileOutputStream = null;

    try{
      fileOutputStream = new FileOutputStream(filePath,true);
      String str = "change info";
      fileOutputStream.write(str.getBytes());
      System.out.println("写入完成");
    }catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        fileOutputStream.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
