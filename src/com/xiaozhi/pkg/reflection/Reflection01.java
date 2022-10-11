package com.xiaozhi.pkg.reflection;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

@SuppressWarnings({"all"})
public class Reflection01 {
  public static void main(String[] args) throws IOException {
    Properties properties = new Properties();
    properties.load(new FileInputStream("./refect.properties"));
    String classFullPath = properties.getProperty("classfullpath").toString();
    String method = properties.getProperty("method").toString();

    System.out.println(classFullPath);
    System.out.println(method);
  }
}
