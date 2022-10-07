package com.xiaozhi.pkg.io;

import java.io.*;

public class Io13 {
  public static void main(String[] args) {
      String srcFilePath = "./avatar.webp";
      String destFilePath = "./hsp.png";

    BufferedInputStream bufferedWriter = null;
    BufferedOutputStream bufferedReader = null;

    try {
      bufferedWriter =  new BufferedInputStream(new FileInputStream(srcFilePath));
      bufferedReader = new BufferedOutputStream(new FileOutputStream(destFilePath));

      byte[] buff = new byte[1024];
      int readLength = 0;
      while ((readLength = bufferedWriter.read())!= -1) {
        bufferedReader.write(buff,0,readLength);
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    } finally {
      if(bufferedWriter != null) {
        try {
          bufferedReader.close();
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
      if (bufferedReader != null) {
        try {
          bufferedReader.close();
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
    }

  }
}
