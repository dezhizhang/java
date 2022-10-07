package com.xiaozhi.pkg.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp15 {
  public static void main(String[] args) {
    String content = "hello韩顺平教育 jack韩顺平老师 韩顺平同学hello";

    String regExp = "韩顺平(?:教育|老师|同学)";

    Pattern pattern = Pattern.compile(regExp);
    Matcher matcher = pattern.matcher(content);
    while (matcher.find()) {
      System.out.println(matcher.group(0));
    }
  }
}
