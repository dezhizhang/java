package com.xiaozhi.algorithm.balancetree;

public class BalanceTree {
  public static void main(String[] args) {
//    int[] arr = {4, 3, 6, 5, 7, 8};
    int[] arr = {10, 12, 8, 9, 7, 6};

    BalanceTreeNode tree = new BalanceTreeNode();
    for (int i = 0; i < arr.length; i++) {
      tree.add(new Node(arr[i]));
    }

    tree.infixOrder();

    System.out.println("当前树的高度" + tree.getRoot().height());
    System.out.println("当前左子树的高度" + tree.getRoot().leftHeight());
    System.out.println("当前右子树的高度" + tree.getRoot().rightHeight());

  }
}

class BalanceTreeNode {
  private Node root;

  public Node getRoot() {
    return this.root;
  }

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
    // 当添加一个节点后如果右子树的高度-左子树的高度大于1左旋转
    if (rightHeight() - leftHeight() > 1) {

      leftRotate();

    }else if(leftHeight() - rightHeight() > 1) {
      rightRotate();
    }
  }

  // 返回当前节点的高度
  public int height() {
    return Math.max(left == null ? 0 : left.height(), right == null ? 0 : right.height()) + 1;
  }

  // 返回左子树的高度
  public int leftHeight() {
    if (left == null) {
      return 0;
    }
    return left.height();
  }

  // 返回右子树高度
  public int rightHeight() {
    if (right == null) {
      return 0;
    }
    return right.height();
  }

  // 左旋转方法
  public void leftRotate() {
    // 创建新的结点，已当前结节的值
    Node newNode = new Node(value);
    // 把新结点的左子树设置成当前结点左子树
    newNode.left = left;
    //把新的节点的右子树设置成根节点的左子树的右子树
    newNode.right = right.left;
    // 把当前节点的值替换成右子结点
    value = right.value;
    //把当前节点的右子树设置成当前节点的左子树的右子树
    right = right.right;
    //把当前节点的左子树设置成新节点
    left = newNode;

  }

  // 右旋转
  public void rightRotate() {
    Node newNode = new Node(value);
    newNode.right = right;
    newNode.left = left.right;
    value = left.value;
    left = left.left;
    right = newNode;
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
