package com.xiaozhi.pkg.collection;


import java.util.ArrayList;
import java.util.HashMap;

public class Collection {
  public static void main(String[] args) {
    ArrayList arrayList = new ArrayList();
    arrayList.add("jack");
    arrayList.add("tom");

    HashMap hashMap = new HashMap();
    hashMap.put("n1","北京");
    hashMap.put("n2","上海");

    System.out.println(arrayList);
    System.out.println(hashMap);

  }
}
