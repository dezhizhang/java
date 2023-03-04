package com.tower.serice;

import com.tower.dao.DiningDao;
import com.tower.domain.Dining;

import java.util.List;

public class DiningService {
  private DiningDao diningDao = new DiningDao();

  // 返回所有餐桌所有信息
  public List<Dining> list() {
    String sql = "select id,status from dining";
    List<Dining> dinings = diningDao.queryMulti(sql, Dining.class);
    return dinings;
  }

  // 通过id获取餐桌信息
  public Dining getDiningById(int id) {
    String sql = "select * from dining where id = ?";
    return diningDao.querySingle(sql, Dining.class, id);
  }

  public boolean orderDining(int id, String name, String phone) {
    String sql = "update dining set status = 1,name = ?,phone = ? where id = ?";
    int update = diningDao.update(sql, name, phone);
    return update > 0;
  }

}
