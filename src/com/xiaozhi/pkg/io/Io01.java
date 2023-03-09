package com.xiaozhi.pkg.io;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class Io01 {
  public static void main(String[] args) {
    created();
  }

  public static void created() {
    String filePath = "./test.txt";
    File file = new File(filePath);

    try {
      file.createNewFile();
      System.out.println("文件创建成功");
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
//  @TestVehicle
  public void created1() {
    File file = new File("./text1");
    String fileName = "news.txt";
    File file1 = new File(file,fileName);

    try {
      file1.createNewFile();
      System.out.println("文件创建成功");
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

}

