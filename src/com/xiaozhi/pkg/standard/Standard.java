package com.xiaozhi.pkg.standard;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Standard {
  public static void main(String[] args) throws IOException {
//    String filePath = "./hello.txt";
//    InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath), "utf-8");
//    BufferedReader br = new BufferedReader(isr);
//
//    String s = br.readLine();
//    System.out.println(s);
//    br.close();

    String filePath = "./hello.txt";
    InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath),"utf-8");
    BufferedReader br = new BufferedReader(isr);

    String s = br.readLine();
    System.out.println(s);
    br.close();
  }
}
