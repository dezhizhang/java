package com.xiaozhi.pkg.set;

import java.util.HashSet;
import java.util.Iterator;

public class Set1 {
  public static void main(String[] args) {


    HashSet hashSet = new HashSet();
    hashSet.add("tom");
    hashSet.add("key");
    hashSet.add("change");
    hashSet.add(null);

    Iterator iterator = hashSet.iterator();
    while (iterator.hasNext()) {
      Object next = iterator.next();
      System.out.println(next);
    }
  }
}
