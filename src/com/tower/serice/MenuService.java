package com.tower.serice;

import com.tower.dao.MenuDao;
import com.tower.domain.Menu;

import java.util.List;

public class MenuService {

  private MenuDao menuDao = new MenuDao();

  //返回所有的菜品
  public List<Menu> list() {
    List<Menu> menus = menuDao.queryMulti("select * from menu", Menu.class);
    return menus;
  }
}
