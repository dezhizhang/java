package com.xiaozhi.algorithm.linkrepeat;

public class LinkRepeat {
  public static void main(String[] args) {
    ListNode node1 = new ListNode(1);
    ListNode node2 = new ListNode(1);
    ListNode node3 = new ListNode(2);
    node1.next = node2;
    node2.next = node3;
//    show(node1);
    show(deleteLinkRepeat(node1));

  }

  public static void show(ListNode head) {
    ListNode temp = head;
    while (temp.next != null) {
      System.out.println("=>" + temp.val);
      temp = temp.next;
    }
  }

  public static ListNode deleteLinkRepeat(ListNode head) {
    if (head == null) {
      return head;
    }
    ListNode temp = head;
    while (null != temp.next) {
      if (temp.next.val == temp.val) {
        temp.next = temp.next.next;
      } else {
        temp = temp.next;
      }
    }
    return head;
  }
}

class ListNode {
  public int val;
  public ListNode next;

  public ListNode(int val) {
    this.val = val;
  }


  @Override
  public String toString() {
    return "ListNode{" + "val=" + val + '}';
  }
}
