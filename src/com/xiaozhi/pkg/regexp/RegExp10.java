package com.xiaozhi.pkg.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp10 {
  public static void main(String[] args) {
    String content = "1111abc";
    String regExp = "1+";

    Pattern pattern = Pattern.compile(regExp);
    Matcher matcher = pattern.matcher(content);

    while (matcher.find()) {
      System.out.println(matcher.group(0));
    }
  }
}
