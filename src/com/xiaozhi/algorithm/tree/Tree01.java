package com.xiaozhi.algorithm.tree;

import java.util.ArrayList;

public class Tree01 {
  public static void main(String[] args) {

    BinaryTree binaryTree = new BinaryTree();
    HeroNode root = new HeroNode(1, "宋江");
    HeroNode node2 = new HeroNode(2, "吴用");
    HeroNode node3 = new HeroNode(3, "卢俊义");
    HeroNode node4 = new HeroNode(4, "林冲");
    binaryTree.setRoot(root);
    root.setLeft(node2);
    root.setRight(node3);
    node3.setRight(node4);

    System.out.println("=======前序遍历=====");
    binaryTree.preOrder();
    System.out.println("=======中序遍历====");
    binaryTree.infixOrder();
    System.out.println("=======后序遍历====");
    binaryTree.postOrder();


  }
}

class BinaryTree {
  private HeroNode root;

  public void setRoot(HeroNode root) {
    this.root = root;
  }

  public void preOrder() {
    if (this.root == null) {
      System.out.println("二叉树为空不能遍历");
      return;
    }
    this.root.preOrder();
  }

  // 中序遍历
  public void infixOrder() {
    if (this.root == null) {
      System.out.println("二叉树为空不能遍历");
      return;
    }
    this.root.infixOrder();
  }

  // 后序遍历
  public void postOrder() {
    if (this.root == null) {
      System.out.println("二叉树为空不能遍历");
      return;
    }
    this.root.postOrder();
  }


}

class HeroNode {
  private int no;
  private String name;
  private HeroNode left;
  private HeroNode right;

  public HeroNode(int no, String name) {
    super();
    this.no = no;
    this.name = name;
  }

  public void setNo(int no) {
    this.no = no;
  }

  public int getNo() {
    return no;
  }

  public void setRight(HeroNode right) {
    this.right = right;
  }

  public HeroNode getRight() {
    return right;
  }

  public void setLeft(HeroNode left) {
    this.left = left;
  }

  public HeroNode getLeft() {
    return left;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "HeroNode[" + "no=" + no + ", name='" + name + '\'' + ']';
  }

  //编写前序遍历
  public void preOrder() {
    System.out.println(this);
    // 递归向左子树前序遍历
    if (this.left != null) {
      this.left.preOrder();
    }

    if (this.right != null) {
      this.right.preOrder();
    }
  }

  //中序遍历
  public void infixOrder() {
    if (this.left != null) {
      this.left.infixOrder();
    }
    System.out.println(this);
    if (this.right != null) {
      this.right.infixOrder();
    }
  }

  //后序遍历
  public void postOrder() {
    if (this.left != null) {
      this.left.postOrder();
    }
    if (this.right != null) {
      this.right.postOrder();
    }
    System.out.println(this);
  }

}
