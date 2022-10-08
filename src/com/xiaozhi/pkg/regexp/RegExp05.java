package com.xiaozhi.pkg.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp05 {
  public static void main(String[] args) {
    String content = "asd12345agd";
    String regExp = "\\d";
    Pattern pattern = Pattern.compile(regExp);
    Matcher matcher = pattern.matcher(content);
    while (matcher.find()) {
      System.out.println(matcher.group(0));
    }
  }
}