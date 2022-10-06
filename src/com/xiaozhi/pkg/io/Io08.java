package com.xiaozhi.pkg.io;

import java.io.FileReader;
import java.io.IOException;

public class Io08 {
  public static void main(String[] args) {
    String filePath = "./hello.txt";
    FileReader fileReader = null;
    int readLength = 0;
    char[] buf = new char[8];

    try {
      fileReader = new FileReader(filePath);
      while ((readLength = fileReader.read(buf)) != -1) {
        System.out.print(new String(buf, 0, readLength));
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        fileReader.close();
      } catch (IOException e) {
        e.printStackTrace();
      }

    }
  }
}
