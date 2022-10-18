package com.xiaozhi.algorithm.binarysort;

public class BinarySort {
  public static void main(String[] args) {
    int[] arr = {7, 3, 10, 12, 5, 1, 9, 2};
    BinarySortTree binarySortTree = new BinarySortTree();

    for (int i = 0; i < arr.length; i++) {

      binarySortTree.add(new Node(arr[i]));
    }

    binarySortTree.infixOrder();
//    binarySortTree.deleteNode(2);
//    System.out.println("删除节点后");
//    binarySortTree.infixOrder();
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

  //查找要删除的节点
  public Node search(int value) {
    if (root != null) {
      return this.root.search(value);
    }
    return null;
  }

  // 查找父节点
  public Node searchParent(int value) {
    if (root != null) {
      return this.root.searchParent(value);
    }
    return null;
  }

  // 删除结点
  public void deleteNode(int value) {
    if (root != null) {
      Node targetNode = search(value);

      // 如果没有找到要删除的节点
      if (targetNode == null) {
        return;
      }
      // 如果当前这颗二叉排序树只有一个节点
      if (root.left == null && root.right == null) {
        root = null;
        return;
      }

      // 找到targetNode的父结点
      Node parent = searchParent(value);
      if (targetNode.left == null && targetNode.right == null) {
        //判断target是父节点的右子节点
        if (parent.left != null && parent.left.value == value) {
          parent.left = null;
        } else if (parent.right != null && parent.right.value == value) {
          parent.right = null;
        }
      }

    }
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
  }

  // 查找要删除的节点
  public Node search(int value) {
    if (value == this.value) {
      return this;
    } else if (value < this.value) {
      if (this.left == null) {
        return null;
      }
      return this.left.search(value);
    } else {
      if (this.right == null) {
        return null;
      }
      return this.right.search(value);
    }
  }

  //查找要删除的父结点
  public Node searchParent(int value) {
    if ((this.left != null && this.left.value == value) || (this.right != null && this.right.value == value)) {
      return this;
    } else if (this.left != null && this.value > value) {
      return this.left.searchParent(value);
    } else if (this.right != null && this.value < value) {
      return this.right.searchParent(value);
    } else {
      return null;
    }
  }


  // 中序遍历二叉树
  public void infixOrder() {
    if (this.left == null) {
      this.left.infixOrder();
    }
    System.out.println(this);
    if (this.right == null) {
      this.right.infixOrder();
    }
  }

  @Override
  public String toString() {
    return "Node[" + "value=" + value + ']';
  }
}
