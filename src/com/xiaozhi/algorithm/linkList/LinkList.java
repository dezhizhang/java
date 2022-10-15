package com.xiaozhi.algorithm.linkList;

public class LinkList {
  public static void main(String[] args) {
    HeroNode hero1 = new HeroNode(1, "宋江", "及时雨");
    HeroNode hero2 = new HeroNode(2, "吴用", "智多星");
    HeroNode hero3 = new HeroNode(3, "林冲", "子头");

    // 加入
    SingleLinkList singleLinkList = new SingleLinkList();
    singleLinkList.add(hero1);
    singleLinkList.add(hero2);
    singleLinkList.add(hero3);

    singleLinkList.list();

  }
}


class SingleLinkList {
  private HeroNode head = new HeroNode(0, "", "");

  // 添加节点
  public void add(HeroNode heroNode) {
    HeroNode temp = head;
    while (true) {
      if (temp.next == null) {
        break;
      }
      temp = temp.next;
    }
    temp.next = heroNode;
  }

  // 显示链表
  public void list() {
    if (head.next == null) {
      System.out.println("链表为空");
      return;
    }
    HeroNode temp = head;
    while (true) {
      if (temp.next == null) {
        break;
      }
      System.out.println(temp);
      temp = temp.next;
    }
  }

}

class HeroNode {
  public int no;
  public String name;
  public String nickName;
  public HeroNode next;

  // 构造方法
  public HeroNode(int no, String name, String nickName) {
    this.no = no;
    this.name = name;
    this.nickName = nickName;
  }

  @Override
  public String toString() {
    return "HeroNode{" + "no=" + no + ", name='" + name + '\'' + ", nickName='" + nickName + '\'' + ", next=" + next + '}';
  }
}


