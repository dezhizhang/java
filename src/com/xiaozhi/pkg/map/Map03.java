package com.xiaozhi.pkg.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map03 {
  public static void main(String[] args) {

    Map map = new HashMap();
    map.put("no01", "刘德华");
    map.put("no02", "周华建");

    Set set = map.entrySet();

    for (Object entry : set) {
      System.out.println(entry);
    }
  }
}
