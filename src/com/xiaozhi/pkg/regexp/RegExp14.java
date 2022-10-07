package com.xiaozhi.pkg.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp14 {
  public static void main(String[] args) {
    String content  = "hashashd s7789 nnas1111ddfsf";
    String regExp = "(\\d\\dd)(\\d\\d)";

    Pattern pattern = Pattern.compile(regExp);
    Matcher matcher = pattern.matcher(content);

    while (matcher.find()) {
      System.out.println(matcher.group(0));
    }
  }
}
