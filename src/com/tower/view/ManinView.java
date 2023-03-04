package com.tower.view;

import java.util.Scanner;

public class ManinView {
  private boolean loop = true;
  private String key = "";

  private String userId = "";

  private String password = "";


  public static void main(String[] args) {
    new ManinView().mainMenu();
  }

  // 显示主菜单
  public void mainMenu() {
    Scanner scanner = new Scanner(System.in);
    while (loop) {
      System.out.println("===============满汉楼============");
      System.out.println("\t\t 1登录满汉楼");
      System.out.println("\t\t 2退出满汉楼");

      System.out.println("请输入你的选择：");
      key = scanner.next();

      switch (key) {
        case "1":
          System.out.println("输入员工号:");
          userId = scanner.next();
          System.out.println("请输入密码：");
          password = scanner.next();
          if(!("123".equals(password))) {
            System.out.println("登录失败");
            break;
          }

          while (loop) {
            System.out.println("============满汉楼二级菜单========");
            System.out.println("\t\t 1 显示餐桌状态");
            System.out.println("\t\t 2 预定餐桌");
            System.out.println("\t\t 3 显示所有菜品");
            System.out.println("\t\t 4 点餐服务");
            System.out.println("\t\t 5 查看帐单");
            System.out.println("\t\t 6 结帐");
            System.out.println("\t\t 9 通出系统");
            switch (key) {
              case "1":
                System.out.println("显示餐桌状态");
                break;
              case "2":
                System.out.println("预定餐桌");
                break;
              case "3":
                System.out.println("显示所有菜品");
                break;
              case "4":
                System.out.println("点餐服务");
                break;
              case "5":
                System.out.println("查看帐单");
                break;
              case "6":
                System.out.println("结帐");
              case "9":
                System.out.println("通出系统");
                loop = false;
                break;
              default:
                System.out.println("请输新登录");

            }
          }
          break;
        case "2":
          loop = false;
          break;
        default:
          System.out.println("输入有误请重新输入");
      }


    }
  }
}
