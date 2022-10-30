package com.xiaozhi.algorithm.treeNode;

public class TreeNode {
  public static void main(String[] args) {
    Node node7 = new Node(7, null, null);
    Node node6 = new Node(6, node7, null);
    Node node5 = new Node(5, null, null);
    Node node4 = new Node(4, null, null);
    Node node3 = new Node(3, node6, null);
    Node node2 = new Node(2, node4, node5);
    Node node1 = new Node(1, node2, node3);


    System.out.println(minDepth(node1));
  }

  public static int minDepth(Node root) {
    if(root == null) {
      return 0;
    }
    if(root.left == null && root.right == null) {
      return 1;
    }

    int min = Integer.MAX_VALUE;
    if(root.left != null) {
      min = Math.min(minDepth(root.left),min);
    }

    if(root.right != null) {
      min = Math.min(minDepth(root.right),min);
    }
    return min + 1;

  }

}

class Node {
  public int val;
  public Node left;
  public Node right;

  public Node(int val, Node left, Node right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }

  @Override
  public String toString() {
    return "Node{" + "val=" + val + ", left=" + left + ", right=" + right + '}';
  }
}
