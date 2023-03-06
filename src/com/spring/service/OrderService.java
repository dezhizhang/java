package com.spring.service;

import com.spring.dao.OrderDao;

public class OrderService {
  private OrderDao orderDao;

  public OrderDao getOrderDao() {
    return orderDao;
  }

  public void setOrderDao(OrderDao orderDao) {
    this.orderDao = orderDao;
  }

}
