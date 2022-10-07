package com.xiaozhi.pkg.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp17 {
  public static void main(String[] args) {
    //验证中文
    //String content = "北京";
    //String regExp = "^[\u0391-\uffe5]+$";

    String content = "123890";
    String regExp = "^[1-9]\\d{5}$";
    Pattern pattern = Pattern.compile(regExp);
    Matcher matcher = pattern.matcher(content);
    if (matcher.find()) {
      System.out.println("满足格式");
    }
  }
}
