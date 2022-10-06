package com.xiaozhi.pkg.io;

import org.junit.jupiter.api.Test;

import java.io.File;

public class Io03 {
  public static void main(String[] args) {

  }

  @Test
  public void mkdir() {
    String filePath = "./test.txt";
    File file = new File(filePath);
    if (!file.exists()){
      System.out.println("文件不存在");
      return;
    }
    file.delete();
    System.out.println("文件删除成功");
  }
}
