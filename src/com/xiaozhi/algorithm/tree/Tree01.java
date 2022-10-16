package com.xiaozhi.algorithm.tree;


public class Tree01 {
  public static void main(String[] args) {

    BinaryTree binaryTree = new BinaryTree();
    HeroNode root = new HeroNode(1, "宋江");
    HeroNode node2 = new HeroNode(2, "吴用");
    HeroNode node3 = new HeroNode(3, "卢俊义");
    HeroNode node4 = new HeroNode(4, "林冲");
    HeroNode node5 = new HeroNode(5, "关胜");
    binaryTree.setRoot(root);
    root.setLeft(node2);
    root.setRight(node3);
    node3.setRight(node4);
    node3.setLeft(node5);

    binaryTree.deleteNode(5);
    binaryTree.preOrder();
//    HeroNode result = null;

//    System.out.println("=======前序遍历=====");

//    System.out.println("=======中序遍历====");
//    binaryTree.infixOrder();
//    System.out.println("=======后序遍历====");
//    binaryTree.postOrder();
//
//
//    System.out.println("===================");
//    System.out.println("=======前序查找=====");
//    result = binaryTree.preOrderSearch(5);
//    if (result != null) {
//      System.out.printf("找到信息id=%d,name=%s\n", result.getNo(), result.getName());
//    }
//    System.out.println("=======中序查找====");
//    result = binaryTree.infixOrderSearch(5);
//    if (result != null) {
//      System.out.printf("找到信息id=%d,name=%s\n", result.getNo(), result.getName());
//    }
//    System.out.println("=======后序查找====");
//    result = binaryTree.preOrderSearch(5);
//    if (result != null) {
//      System.out.printf("找到信息id=%d,name=%s\n", result.getNo(), result.getName());
//    }
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

  // 前序遍历
  public HeroNode preOrderSearch(int no) {
    if (this.root == null) {
      System.out.println("二叉树为空不能遍历");
      return null;
    }
    return this.root.preOrderSearch(no);
  }

  // 中序遍历
  public HeroNode infixOrderSearch(int no) {
    if (this.root == null) {
      System.out.println("二叉树为空不能遍历");
      return null;
    }

    return this.root.infixOrderSearch(no);
  }

  // 后序遍历
  public HeroNode postOrderSearch(int no) {
    if (this.root == null) {
      System.out.println("二叉树为空不能遍历");
      return null;
    }
    return this.root.postOrderSearch(no);
  }

  public void deleteNode(int no) {
    if (this.root == null) {
      System.out.println("二叉树为空不能遍历");
    }
    if (root.getNo() == no) {
      root = null;
      return;
    }
    this.root.deleteNode(no);
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

  // 前序查找
  public HeroNode preOrderSearch(int no) {
    if (this.no == no) {
      return this;
    }
    HeroNode resultNode = null;
    if (this.left != null) {
      resultNode = this.left.preOrderSearch(no);
    }
    if (resultNode != null) {
      return resultNode;
    }
    if (this.right != null) {
      resultNode = this.right.preOrderSearch(no);
    }
    return resultNode;
  }

  // 中序遍历查找
  public HeroNode infixOrderSearch(int no) {
    HeroNode resultNode = null;
    if (this.left != null) {
      resultNode = this.left.infixOrderSearch(no);
    }
    if (resultNode != null) {
      return resultNode;
    }
    if (this.no == no) {
      return this;
    }
    // 否则向左进行中间查找
    if (this.right != null) {
      resultNode = this.right.infixOrderSearch(no);
    }
    return resultNode;
  }

  // 后序遍历查找
  public HeroNode postOrderSearch(int no) {
    HeroNode resultNode = null;
    if (this.left != null) {
      resultNode = this.left.postOrderSearch(no);
    }
    if (resultNode != null) {
      return resultNode;
    }
    if (this.right != null) {
      resultNode = this.right.postOrderSearch(no);
    }

    if (this.no == no) {
      return this;
    }
    return resultNode;
  }

  // 删除节点
  public void deleteNode(int no) {
    if (this.left != null && this.left.no == no) {
      this.left = null;
      return;
    }

    if (this.right != null && this.right.no == no) {
      this.right = null;
      return;
    }

    if (this.left != null) {
      this.left.deleteNode(no);
    }
    if (this.right != null) {
      this.right.deleteNode(no);
    }

  }

}
