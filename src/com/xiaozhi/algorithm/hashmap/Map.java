package com.xiaozhi.algorithm.hashmap;

import org.w3c.dom.Node;

import java.util.HashMap;

public class Map {
  public static void main(String[] args) {
    HashMap map = new HashMap();
    map.put("name","张三");
    System.out.println(map.containsKey("name"));
    System.out.println(map.get("name"));
  }

//  public static Node reverseLinkList(Node head) {
//    Node pre = null;
//    Node next = null;
//    while (head != null) {
//      next = head.next;
//      head.next = pre;
//      pre = head;
//      head = next;
//    }
//  }
}
