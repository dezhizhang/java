package com.xiaozhi.algorithm.linkList;

public class LinkList {
  public static void main(String[] args) {
    HeroNode hero1 = new HeroNode(1, "宋江", "及时雨");
    HeroNode hero2 = new HeroNode(2, "吴用", "智多星");
    HeroNode hero3 = new HeroNode(3, "林冲", "子头");

    // 加入
    SingleLinkList singleLinkList = new SingleLinkList();
    singleLinkList.addByOrder(hero2);
    singleLinkList.addByOrder(hero3);
    singleLinkList.addByOrder(hero1);
//    singleLinkList.delete(3);

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

  // 有序添加节点到链表中
  public void addByOrder(HeroNode heroNode) {
    HeroNode temp = head;
    boolean flag = false;
    while (true) {
      if (temp.next == null) {
        break;
      }
      if (temp.next.no == heroNode.no) {
        flag = true;
        break;
      }
      if (temp.next.no > heroNode.no) {
        break;
      }
      temp = temp.next;
    }
    if (!flag) {
      heroNode.next = temp;
      temp.next = heroNode;
    }
    if (flag) {
      System.out.printf("添加的数据已经存在%d", temp.no);
    }
  }

  public void update(HeroNode heroNode) {
    if (head.next == null) {
      System.out.println("链表为空");
      return;
    }

    // 临时节点
    HeroNode temp = head;
    boolean flag = false;
    while (true) {
      if (temp.next == null) {
        break;
      }
      if (temp.no == heroNode.no) {
        flag = true;
        break;
      }
      temp = temp.next;
    }

    if (flag) {
      temp.next.name = heroNode.name;
      temp.next.nickName = head.nickName;
    }

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

  // 删除节点
  public void delete(int no) {
    if (head.next == null) {
      System.out.println("链表为空");
      return;
    }
    HeroNode temp = head;
    boolean flag = false;
    while (true) {
      if (temp.next == null) {
        System.out.println("没有找到要删除的节点");
        break;
      }
      if (temp.next.no == no) {
        flag = true;
        break;
      }
      temp = temp.next;
    }
    if (flag) {
      temp.next = temp.next.next;
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
    return "HeroNode{" + "no=" + no + "name=" + name + "}";
  }
}


