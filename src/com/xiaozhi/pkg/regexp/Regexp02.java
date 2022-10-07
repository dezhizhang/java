package com.xiaozhi.pkg.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexp02 {
  public static void main(String[] args) {
    String content = "1994年6、7月间，在经历了一场历时三天的讨论之后，团队决定再一次改变了努力的目标，这次他们决定将该技术应用于万维网。" +
      "他们认为随着Mosaic浏览器的到来，因特网正在向同样的高度互动的远景演变，而这一远景正是他们在有线电视网中看到的。" +
      "作为原型，帕特里克·诺顿写了一个小型万维网浏览器WebRunner。";
    String regexp = "\\d\\d\\d\\d";

    Pattern pattern = Pattern.compile(regexp);

    Matcher matcher = pattern.matcher(content);

    while (matcher.find()) {
      System.out.println(matcher.group(0));
    }
  }
}
