package com.xiaozhi.pkg.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp07 {
  public static void main(String[] args) {
    String content = "zhangdezhi 张 晓智";
    String regExp = "zhang|张|智";

    Pattern pattern = Pattern.compile(regExp);
    Matcher matcher = pattern.matcher(content);

    while (matcher.find()) {
      System.out.println(matcher.group(0));
    }
  }
}
