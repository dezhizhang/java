package com.xiaozhi.algorithm.treeNode;

import com.xiaozhi.algorithm.linkList.LinkList;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
  public static void main(String[] args) {
    Node node7 = new Node(7, null, null);
    Node node6 = new Node(6, node7, null);
    Node node5 = new Node(5, null, null);
    Node node4 = new Node(4, null, null);
    Node node3 = new Node(3, node6, null);
    Node node2 = new Node(2, node4, node5);
    Node node1 = new Node(1, node2, node3);


    System.out.println(minDepth1(node1));
  }

  public static int minDepth(Node root) {
    if (root == null) {
      return 0;
    }
    if (root.left == null && root.right == null) {
      return 1;
    }

    int min = Integer.MAX_VALUE;
    if (root.left != null) {
      min = Math.min(minDepth(root.left), min);
    }

    if (root.right != null) {
      min = Math.min(minDepth(root.right), min);
    }
    return min + 1;

  }

  public static int minDepth1(Node root) {
    if (root == null) {
      return 0;
    }
    Queue<Node> queue = new LinkedList<>();
    root.setDeep(1);
    queue.offer(root);
    while (!queue.isEmpty()) {
      Node node = queue.poll();
      if (node.left == null && node.right == null) {
        return node.deep;
      }
      if (node.left != null) {
        node.left.setDeep(node.deep + 1);
        queue.offer(node.left);
      }
      if (node.right != null) {
        node.right.setDeep(node.deep + 1);
        queue.offer(node.right);
      }
    }
    return 0;
  }

}

class Node {
  public int val;
  public Node left;
  public Node right;

  public int deep;

  public Node(int val, Node left, Node right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }

  public void setDeep(int deep) {
    this.deep = deep;
  }

  @Override
  public String toString() {
    return "Node{" + "val=" + val + ", left=" + left + ", right=" + right + '}';
  }
}
