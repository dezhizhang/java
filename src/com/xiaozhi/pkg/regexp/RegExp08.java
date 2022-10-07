package com.xiaozhi.pkg.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp08 {
  public static void main(String[] args) {
    String content = "1111111111";
    String regExp = "1{3,}";

    Pattern pattern = Pattern.compile(regExp);
    Matcher matcher = pattern.matcher(content);

    while (matcher.find()) {
      System.out.println(matcher.group(0));
    }
  }
}
