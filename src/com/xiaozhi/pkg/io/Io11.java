package com.xiaozhi.pkg.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Io11 {
  public static void main(String[] args) {
    String filePath = "./hello.txt";
    try {
      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
      bufferedWriter.write("hello 你好贵州贵阳");
      bufferedWriter.close();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
