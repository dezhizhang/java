package com.spring.web;

import com.spring.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderAction {

  private OrderService orderService;

  public OrderService getOrderService() {
    return orderService;
  }

  public void setOrderService(OrderService orderService) {
    this.orderService = orderService;
  }

}
