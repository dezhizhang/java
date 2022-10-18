package com.xiaozhi.algorithm.binarysort;

public class BinarySort {
  public static void main(String[] args) {
      int[] arr = {7,3,10,12,5,1,9};
    BinarySortTree binarySortTree = new BinarySortTree();

    for(int i=0;i < arr.length;i++) {

      binarySortTree.add(new Node(arr[i]));
    }

    binarySortTree.infixOrder();

  }
}

// 创建二叉排序树
class BinarySortTree {
  private Node root;

  public void add(Node node) {
    if (root == null) {
      this.root = node;
    } else {
      this.root.add(node);
    }
  }

  // 中序遍历
  public void infixOrder() {
    if (root == null) {
      System.out.println("二叉排序树为空");
      return;
    }
    root.infixOrder();
  }

}

// 创建node节点
class Node {
  int value;
  Node left;
  Node right;

  public Node(int value) {
    this.value = value;
  }

  // 添加节点的方法
  public void add(Node node) {
    if (node == null) {
      System.out.println("树为空");
      return;
    }
    if (node.value < this.value) {
      if (this.left == null) {
        this.left = node;
      } else {
        this.left.add(node);
      }
    } else {
      if (this.right == null) {
        this.right = node;
      } else {
        this.right.add(node);
      }
    }
  }

  // 中序遍历二叉树
  public void infixOrder() {
    if (this.left != null) {
      this.left.infixOrder();
    }
    System.out.println(this);
    if (this.right != null) {
      this.right.infixOrder();
    }
  }

  @Override
  public String toString() {
    return "Node[" + "value=" + value + ']';
  }
}
