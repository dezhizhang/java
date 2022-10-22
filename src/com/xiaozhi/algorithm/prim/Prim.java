package com.xiaozhi.algorithm.prim;

public class Prim {
  public static void main(String[] args) {
    Node node5 = new Node(5, null);
    Node node4 = new Node(4, node5);
    Node node3 = new Node(3, node4);
    Node node2 = new Node(2, node3);
    Node node1 = new Node(1, node2);
    Node prev = recursion(node1);
    System.out.println(prev);
  }

  public static Node iterate(Node head) {
    Node prev = null;
    Node next;
    Node temp = head;
    while (temp != null) {
      next = temp.next;
      temp.next = prev;
      prev = temp;
      temp = next;
    }
    return prev;
  }

  public static Node recursion(Node head) {
    if (head == null || head.next == null) {
      return head;
    }
    Node temp = recursion(head.next);
    head.next.next = head;
    head.next = null;
    return temp;
  }
}

class Node {
  public int value;
  public Node next;

  public Node(int value, Node next) {
    this.value = value;
    this.next = next;
  }
}
