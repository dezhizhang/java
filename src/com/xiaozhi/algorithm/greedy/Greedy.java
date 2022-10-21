package com.xiaozhi.algorithm.greedy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

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


    // all存放所有的地区
    HashSet<String> allAreas = new HashSet<String>();
    allAreas.add("北京");
    allAreas.add("上海");
    allAreas.add("天津");
    allAreas.add("广州");
    allAreas.add("北京");
    allAreas.add("深圳");
    allAreas.add("成都");
    allAreas.add("上海");
    allAreas.add("杭州");
    allAreas.add("上海");
    allAreas.add("天津");
    allAreas.add("杭州");
    allAreas.add("大连");

    // 创建一个arrayList存放电台集合
    List<String> list = new ArrayList<>();


  }
}
