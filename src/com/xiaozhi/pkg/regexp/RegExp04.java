package com.xiaozhi.pkg.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp04 {
  public static void main(String[] args) {
    String content = "a11c8abcABC";
    String regExp = "(?i)abc";
    Pattern pattern = Pattern.compile(regExp);
    Matcher matcher = pattern.matcher(content);

    while (matcher.find()) {
      System.out.println("找到" + matcher.group(0));
    }
  }
}
