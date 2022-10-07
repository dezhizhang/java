package com.xiaozhi.pkg.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Io10 {
  public static void main(String[] args) {
    String filePath = "./info.txt";
    try {
      BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
      String line;
      while ((line = bufferedReader.readLine())!= null) {
        System.out.println(line);
      }
      bufferedReader.close();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
