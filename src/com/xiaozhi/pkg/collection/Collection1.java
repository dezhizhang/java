package com.xiaozhi.pkg.collection;

import java.util.ArrayList;
import java.util.List;

public class Collection1 {
  public static void main(String[] args) {
    List arrayList =new ArrayList();
    arrayList.add("tom");
    arrayList.add(10);
    arrayList.add(true);


    System.out.println(arrayList);
    // 删除完素
    arrayList.remove(1);
    System.out.println(arrayList);
    //查找元素是否存在
    System.out.println(arrayList.contains("tom"));
    //获取元素的大小
    System.out.println(arrayList.size());
    //判断是否为空
    System.out.println(arrayList.isEmpty());
    //添空元素
    arrayList.clear();
    System.out.println(arrayList);

    ArrayList list2 = new ArrayList();
    list2.add("红楼攀");
    list2.add("三国演义");

    arrayList.addAll(list2);
    System.out.println(arrayList);
    //判断多个几何是否存在
    System.out.println( arrayList.containsAll(list2));
    arrayList.removeAll(list2);
    System.out.println(arrayList);
  }
}
