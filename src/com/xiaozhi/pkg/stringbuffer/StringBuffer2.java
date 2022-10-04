package com.xiaozhi.pkg.stringbuffer;

public class StringBuffer2 {
  public static void main(String[] args) {
    String str = "hello world";
    StringBuffer stringBuffer2 = new StringBuffer(str);
    System.out.println(stringBuffer2);

    //使用append添加
    StringBuffer stringBuffer = new StringBuffer();
    stringBuffer = stringBuffer2.append(str);
    System.out.println(stringBuffer);

    // String转成StringBuffer
    StringBuffer stringBuffer1 = new StringBuffer("hello world");
    String str1 = stringBuffer1.toString();
    System.out.println(str1);
    String str2 = new String(stringBuffer1);
    System.out.println(str2);
  }
}
