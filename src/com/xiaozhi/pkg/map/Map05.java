package com.xiaozhi.pkg.map;

import java.util.*;

public class Map05 {
  public static void main(String[] args) {
    Map map = new HashMap();
    map.put("name", "刘德华");
    map.put("age", 22);
    map.put("id", "12345");

    Set set = map.keySet();

    System.out.println("======第一种方法=======");
    for (Object key : set) {
      System.out.println(key + "" + map.get(key));
    }


    System.out.println("=====第二种方法======");
    Iterator iterator = set.iterator();
    while (iterator.hasNext()) {
      Object key = iterator.next();
      System.out.println(key + "" + map.get(key));
    }

    System.out.println("=====第三种方法");
    Collection values = map.values();

    for (Object key : values) {
      System.out.println(key + "" + key);
    }

    System.out.println("====第四种方法====");
    Iterator integer2 = values.iterator();
    while (integer2.hasNext()) {
      Object value = integer2.next();
      System.out.println(value);
    }

    System.out.println("====第五种方法=====");

    Set entrySet = map.entrySet();
    for (Object entry : entrySet) {
      Map.Entry m = (Map.Entry) entry;
      System.out.println(m.getKey() + "" + m.getValue());
    }

    System.out.println("====第四种方法=====");
    Iterator iterator2 = entrySet.iterator();
    while (integer2.hasNext()) {
      Object next = iterator2.next();
      System.out.println(next.getClass());
    }

  }
}
