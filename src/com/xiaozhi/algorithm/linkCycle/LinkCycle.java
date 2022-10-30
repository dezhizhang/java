package com.xiaozhi.algorithm.linkCycle;

import java.util.HashSet;
import java.util.Set;

public class LinkCycle {

  static class ListNode {
    int val;
    ListNode next;

    public ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }

  public static void main(String[] args) {
    ListNode node5 = new ListNode(5, null);
    ListNode node4 = new ListNode(4, node5);
    ListNode node3 = new ListNode(3, node4);
    ListNode node2 = new ListNode(2, node3);
    ListNode node1 = new ListNode(1, node2);

    node5.next = node1;

    System.out.println(hasCycle(node1));

  }

  public static boolean hasCycle(ListNode head) {
    Set<ListNode> set = new HashSet<>();
    while (head.next != null) {
      if(!set.add(head)) {
          return true;
      }
      head = head.next;
    }
    return false;
  }
}
