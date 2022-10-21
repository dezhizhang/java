package com.xiaozhi.algorithm.greedy;

import java.util.HashMap;
import java.util.HashSet;

public class Greedy {
  public static void main(String[] args) {
    HashMap<String, HashSet<String>> hashmap = new HashMap<>();
    HashSet<String> hashSet1 = new HashSet<String>();
    hashSet1.add("北京");
    hashSet1.add("上海");
    hashSet1.add("天津");


    HashSet<String> hashSet2 = new HashSet<>();
    hashSet2.add("广州");
    hashSet2.add("北京");
    hashSet2.add("深圳");

    HashSet<String> hashSet3 = new HashSet<>();
    hashSet3.add("成都");
    hashSet3.add("上海");
    hashSet3.add("杭州");

    HashSet<String> hashSet4 = new HashSet<>();
    hashSet4.add("上海");
    hashSet4.add("天津");

    HashSet<String> hashSet5 = new HashSet<>();
    hashSet5.add("杭州");
    hashSet5.add("大连");

    hashmap.put("K1", hashSet1);
    hashmap.put("K2", hashSet2);
    hashmap.put("K3", hashSet3);
    hashmap.put("K4", hashSet4);
    hashmap.put("k5", hashSet5);

  }
}
