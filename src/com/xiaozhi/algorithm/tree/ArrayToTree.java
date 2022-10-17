package com.xiaozhi.algorithm.tree;

public class ArrayToTree {
  public static void main(String[] args) {

  }
}


class HeroNode1 {
  private int no;
  private String name;
  private HeroNode1 left;
  private HeroNode1 right;

  public HeroNode1(int no, String name) {
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

  public void setRight(HeroNode1 right) {
    this.right = right;
  }

  public HeroNode1 getRight() {
    return right;
  }

  public void setLeft(HeroNode1 left) {
    this.left = left;
  }

  public HeroNode1 getLeft() {
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
  public HeroNode1 preOrderSearch(int no) {
    if (this.no == no) {
      return this;
    }
    HeroNode1 resultNode = null;
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
  public HeroNode1 infixOrderSearch(int no) {
    HeroNode1 resultNode = null;
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
  public HeroNode1 postOrderSearch(int no) {
    HeroNode1 resultNode = null;
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
