package com.xiaozhi.pkg.io;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class Io04 {
  public static void main(String[] args) {

  }
  @Test
  public void readFile() {
    String path = "hello.txt";
    int readData = 0;
    FileInputStream fileInputStream = null;
    try {
       fileInputStream = new FileInputStream(path);
      while ((readData = fileInputStream.read()) != -1) {
          System.out.println((char) readData);
      }
    } catch (IOException e) {
       e.printStackTrace();
    } finally {
      try{
        fileInputStream.close();
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

  }
}


