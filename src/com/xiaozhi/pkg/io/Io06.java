package com.xiaozhi.pkg.io;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Io06 {
  public static void main(String[] args) {

  }
  @Test
  public void  copyFile() {

    String srcFilePath = "./avatar.webp";
    String distFilePath = "./avatar1.png";

    FileInputStream fileInputStream = null;
    FileOutputStream fileOutputStream = null;

    try{
      fileInputStream = new FileInputStream(srcFilePath);
      fileOutputStream = new FileOutputStream(distFilePath);

      byte[] buf = new byte[1024];
      int readLength = 0;
      while ((readLength = fileInputStream.read(buf))!= -1) {
        fileOutputStream.write(buf,0,readLength);
      }

      System.out.println("文件复制完");

    } catch (IOException e) {
      e.printStackTrace();
    }finally {
      try {
        fileInputStream.close();
        fileOutputStream.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

  }

}
