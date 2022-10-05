package com.xiaozhi.pkg.set;

import java.util.HashSet;

public class Set2 {
  public static void main(String[] args) {
    HashSet hashSet = new HashSet();

    System.out.println(hashSet.add("john"));
    System.out.println(hashSet.add("lucy"));
    System.out.println(hashSet.add("john"));
    System.out.println(hashSet.add("jack"));
    System.out.println(hashSet.add("Rose"));
    hashSet.remove("john");
    System.out.println(hashSet);
  }
}

