package com.tower.view;

import com.tower.domain.Dining;
import com.tower.domain.Employee;
import com.tower.serice.DiningService;
import com.tower.serice.EmployService;

import java.util.List;
import java.util.Scanner;

public class ManinView {
  private boolean loop = true;
  private String key = "";

  private Integer userId = 0;

  private String password = "";

  private EmployService employService = new EmployService();
  private DiningService diningService = new DiningService();

  public static void main(String[] args) {
    new ManinView().mainMenu();
  }

  // 显示餐桌所有状态
  public void showDiningStatus() {
    List<Dining> list = diningService.list();
    for (Dining dining:list) {
      System.out.println(dining);
    }
    System.out.println("=======显示完毕=====");
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
          userId = scanner.nextInt();
          System.out.println("请输入密码：");
          password = scanner.next();
          Employee employee =  employService.getEmployeeByIdAndName(userId,password);

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
