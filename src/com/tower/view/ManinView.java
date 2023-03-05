package com.tower.view;

import com.tower.domain.Dining;
import com.tower.domain.Employee;
import com.tower.domain.Menu;
import com.tower.serice.DiningService;
import com.tower.serice.EmployService;
import com.tower.serice.MenuService;

import java.util.List;
import java.util.Scanner;

public class ManinView {
  private boolean loop = true;
  private String key = "";

  private Integer userId = 0;

  private String password = "";

  private EmployService employService = new EmployService();
  private DiningService diningService = new DiningService();

  private MenuService menuService = new MenuService();

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

  public void orderDiningTable() {
    System.out.println("=======预定餐桌=====");
    System.out.println("请选择要预定的餐桌编号（-1退出）");

  }

  // 显示主菜单
  public void mainMenu() {
    List<Menu> list = menuService.list();

    for(Menu menu:list) {
      System.out.println("菜单id" + menu.getId() + "菜单名称" + menu.getName() + "菜单价格" + menu.getPrice());
    }

//    Scanner scanner = new Scanner(System.in);
//    userId = scanner.nextInt();
//    Dining dining =  diningService.getDiningById(userId);
//
//    System.out.println(dining.getName());







  }
}
