package com.xiaozhi.algorithm.tree;

public class HuffmanTree {
  public static void main(String[] args) {

  }
}

class Node implements Comparable<Node> {
  int value; // 节点的权值
  Node left; // 指缶左子节点
  Node right;// 指向右子节点

  public Node(int value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "Node[" + "value=" + value + ']';
  }

  @Override
  public int compareTo(Node o) {
    return this.value - o.value;
  }
}


