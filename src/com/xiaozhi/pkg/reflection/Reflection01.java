package com.xiaozhi.pkg.reflection;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

@SuppressWarnings({"all"})
public class Reflection01 {
  public static void main(String[] args) throws IOException {
    Properties properties = new Properties();
    properties.load(new FileInputStream("src/com.xiaozhi.pkg.reflection"));
//    String class
  }
}
