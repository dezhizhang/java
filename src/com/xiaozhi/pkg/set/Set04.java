package com.xiaozhi.pkg.set;

import java.util.HashSet;

public class Set04 {
  public static void main(String[] args) {
    HashSet hashSet = new HashSet();
    hashSet.add(new String("tom"));
    hashSet.add(new String("tom"));

    System.out.println(hashSet);

  }
}
