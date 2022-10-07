package com.xiaozhi.pkg.standard;

import java.io.*;

public class Standard01 {
  public static void main(String[] args) throws IOException {

    String filePath = "./hello.txt";
    OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(filePath),"utf8");
    osw.write("hi 晓智云");
    osw.close();
    System.out.println("保存文件成功");

  }
}
