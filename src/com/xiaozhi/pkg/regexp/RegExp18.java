package com.xiaozhi.pkg.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp18 {
  public static void main(String[] args) {
    String content = "hello jack14 tom11 jack22 yyy xxx";
    String regExp = "(\\d)\\1";
    Pattern pattern = Pattern.compile(regExp);
    Matcher matcher = pattern.matcher(content);
    while (matcher.find()) {
      System.out.println(matcher.group(0));
    }
  }
}
