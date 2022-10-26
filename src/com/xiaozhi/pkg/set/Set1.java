package com.xiaozhi.pkg.set;

import java.util.HashSet;
import java.util.Iterator;

public class Set1 {
  public static void main(String[] args) {

    HashSet hashSet = new HashSet();
    hashSet.add("red");
    hashSet.add("yellow");
    hashSet.add("orange");
    hashSet.add("pink");

   Iterator iterator = hashSet.iterator();
   while (iterator.hasNext()) {
     Object next = iterator.next();
     System.out.println(next);
   }
  }
}
