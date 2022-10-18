package com.xiaozhi.algorithm.huffman;

import java.util.*;

public class HuffmanCode {
  public static void main(String[] args) {
    String content = "i like like like java do you like a java";
    byte[] bytes = content.getBytes();

    List<Node> nodes = getNodes(bytes);
    Node huffmanTree = createHuffmanTree(nodes);
    preOrder(huffmanTree);
//    System.out.println("huffmanTree" + huffmanTree);

  }

  public static List<Node> getNodes(byte[] bytes) {
    //创建一个ArrayList
    ArrayList nodes = new ArrayList();
    //遍历bytes 统计每一个byte出现的次数
    Map<Byte, Integer> map = new HashMap<>();
    for (byte b : bytes) {
      Integer count = map.get(b);
      if (count == null) {
        map.put(b, 1);
      } else {
        map.put(b, count + 1);
      }
    }
    // 把每个键值转成一个Node对像并加入到node集合
    // 遍历map
    for (Map.Entry<Byte, Integer> entry : map.entrySet()) {
      nodes.add(new Node(entry.getKey(), entry.getValue()));
    }
    return nodes;
  }

  // 前序遍历
  public static void preOrder(Node root) {
    if(root == null) {
      System.out.println("树不能为空");
      return;
    }
    root.perOrder();
  }

  // 通过List创建赫夫曼树
  public static Node createHuffmanTree(List<Node> nodes) {
    while (nodes.size() > 1) {
      //从小到大排序
      Collections.sort(nodes);
      // 取出第一颗最小的二叉树
      Node leftNode = nodes.get(0);
      // 取出第二棵最小二叉树
      Node rightNode = nodes.get(1);

      Node parent = new Node(null, leftNode.weight + rightNode.weight);
      parent.left = leftNode;
      parent.right = rightNode;

      // 将已处理的两棵二叉树node移除
      nodes.remove(leftNode);
      nodes.remove(rightNode);

      nodes.add(parent);

    }
    return nodes.get(0);
  }

}

class Node implements Comparable<Node> {
  Byte data; // 存放数据本身
  int weight; // 权值
  Node left;
  Node right;

  public Node(Byte data, int weight) {
    this.data = data;
    this.weight = weight;
  }

  @Override
  public int compareTo(Node o) {
    //从小到大排序
    return this.weight - o.weight;
  }

  @Override
  public String toString() {
    return "Node[" + "data=" + data + ", weight=" + weight + ']';
  }

  // 前序遍历
  public void perOrder() {
    System.out.println(this);
    if (this.left != null) {
      this.left.perOrder();
    }
    if (this.right != null) {
      this.right.perOrder();
    }
  }
}
