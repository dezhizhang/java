package com.xiaozhi.pkg.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexp01 {
  public static void main(String[] args) {
    String content = "你好hello world";
    Pattern pattern = Pattern.compile("[a-zA-Z]");
    Matcher matcher = pattern.matcher(content);
    System.out.println(matcher.find());
  }
}
