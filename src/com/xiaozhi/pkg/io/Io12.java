package com.xiaozhi.pkg.io;

import java.io.*;

public class Io12 {
  public static void main(String[] args) {
    String srcFilePath = "./hello.txt";
    String destFilePath = "./change.txt";

    BufferedWriter bufferedWriter = null;
    BufferedReader bufferedReader = null;
    String line;

    try {
      bufferedReader = new BufferedReader(new FileReader(srcFilePath));
      bufferedWriter = new BufferedWriter(new FileWriter(destFilePath));
      while ((line = bufferedReader.readLine()) != null) {
        bufferedWriter.write(line);
        bufferedWriter.newLine();
      }
      System.out.println("文件拷贝成功");
    } catch (IOException e) {
      throw new RuntimeException(e);
    } finally {
      if(bufferedReader != null) {
        try {
          bufferedWriter.close();
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
      if (bufferedWriter != null) {
        try {
          bufferedWriter.close();
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
    }

  }
}
