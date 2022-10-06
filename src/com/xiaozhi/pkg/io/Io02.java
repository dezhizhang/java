package com.xiaozhi.pkg.io;

import org.junit.jupiter.api.Test;

import java.io.File;

public class Io02 {
  public static void main(String[] args) {
  }
  @Test
  public void info() {
    File file = new File("./test.txt");

    System.out.println("获取文件名" + file.getName());
    System.out.println("获取绝对路径" + file.getAbsolutePath());
    System.out.println("获取文件父级目录" + file.getParent());
    System.out.println("文件大小=" + file.length());
    System.out.println("是不是一个文件" + file.isFile());
    System.out.println("是不是一个目录" + file.isDirectory());
  }
}


