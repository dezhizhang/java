package com.xiaozhi.pkg.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {
  public static void main(String[] args) {
    String content = "a1aaa12";

    String regExp = "a1?";

    Pattern pattern = Pattern.compile(regExp);
    Matcher matcher = pattern.matcher(content);
    while (matcher.find()) {
      System.out.println(matcher.group(0));
    }
  }
}
