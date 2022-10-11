package com.xiaozhi.pkg.error;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Error04 {
  public static void main(String[] args) {

  }
  public void f2() throws Exception {
    FileInputStream fileInputStream = new FileInputStream("./hello");
  }
}
