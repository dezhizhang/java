package com.xiaozhi.pkg.io;


import java.io.FileReader;
import java.io.IOException;

public class Io07 {
  public static void main(String[] args) {

    String filePath = "./hello.txt";
    FileReader fileReader = null;
    int data = 0;
    try{
      fileReader = new FileReader(filePath);
      while ((data = fileReader.read()) != -1) {
        System.out.print((char) data);
      }
    }catch (IOException e) {
      e.printStackTrace();
    }
  }
}
