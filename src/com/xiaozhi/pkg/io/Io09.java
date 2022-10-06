package com.xiaozhi.pkg.io;

import java.io.FileWriter;
import java.io.IOException;

public class Io09 {
  public static void main(String[] args) {
    String filePath = "./info.txt";
    FileWriter fileWriter = null;

    try{
      fileWriter = new FileWriter(filePath);
      fileWriter.write("贵州你好".toCharArray());

    } catch (IOException e) {
      e.printStackTrace();
    }finally {
      try{
        fileWriter.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
