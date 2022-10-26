package com.xiaozhi.pkg.set;

import java.util.HashSet;

public class HashSet03 {
  public static void main(String[] args) {
    HashSet hashSet = new HashSet();
    hashSet.add(new String("阿黄"));
    hashSet.add(new String("阿黄"));

    System.out.println(hashSet);
  }
}
