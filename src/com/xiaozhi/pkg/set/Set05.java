package com.xiaozhi.pkg.set;

public class Set05 {
  public static void main(String[] args) {
    Node[] table = new Node[16];

    Node john = new Node("john",null);
    table[2] = john;

    Node jack = new Node("jack",null);
    john.next = jack;

    Node rose = new Node("rose",null);
    jack.next = rose;
    System.out.println(table);
  }
}

class Node{
  Object item;
  Node next;
  public Node(Object item,Node next) {
    this.item = item;
    this.next = next;
  }
}
