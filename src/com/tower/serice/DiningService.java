package com.tower.serice;

import com.tower.dao.DiningDao;
import com.tower.domain.Dining;

import java.util.List;

public class DiningService {
  private DiningDao  diningDao = new DiningDao();

  // 返回所有餐桌所有信息
  public List<Dining> list() {
    String sql = "select id,status from dining";
    List<Dining> dinings = diningDao.queryMulti(sql, Dining.class);
    return dinings;
  }

}
