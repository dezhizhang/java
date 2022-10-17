package com.xiaozhi.algorithm.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HuffmanTree {
  public static void main(String[] args) {
    int arr[] = {13, 7, 8, 3, 29, 6, 1};
    Node node = createHuffmanTree(arr);
    preOrder(node);
  }

  public static void preOrder(Node root) {
    if (root == null) {
      System.out.println("该树为空不能遍历~~~");
      return;
    }
    root.preOrder();
  }

  public static Node createHuffmanTree(int[] arr) {
    //将node放入集合中
    List<Node> nodes = new ArrayList<>();
    for (int value : arr) {
      nodes.add(new Node(value));
    }

    while (nodes.size() > 1) {

      Collections.sort(nodes);
      // 取出根节点权值最小的两颗二叉树
      //(1) 取出权值最小的节点
      Node left = nodes.get(0);
      //(2) 取出权值第二小的的节点
      Node right = nodes.get(1);

      //(3)构建成一颗新的二叉树
      Node parent = new Node(left.value + right.value);
      parent.left = left;
      parent.right = right;

      //(4)从ArrayList删除处理过的二叉树
      nodes.remove(left);
      nodes.remove(right);

      //(5)将parent加入到nodes
      nodes.add(parent);
    }
    // 返回赫夫曼树的节点
    return nodes.get(0);
  }
}

class Node implements Comparable<Node> {
  int value; // 节点的权值
  Node left; // 指缶左子节点
  Node right;// 指向右子节点

  public Node(int value) {
    this.value = value;
  }

  //前序遍历
  public void preOrder() {
    System.out.println(this);
    if (this.left != null) {
      this.left.preOrder();
    }
    if (this.right != null) {
      this.right.preOrder();
    }
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


