package com.xiaozhi.pkg.set;

import java.util.HashSet;

public class HashSetMap {
  public static void main(String[] args) {
    HashSet<Object> sets = new HashSet<>();
    System.out.println(sets.add("red"));
    System.out.println(sets.add("yellow"));
    System.out.println(sets.add("pink"));
    System.out.println(sets.add("red"));

    System.out.println("set" + sets);

  }
}
