package com.spring.component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


@Controller
public class UserController {


  @Autowired
  @Qualifier(value = "userService")
  private UserService userService;

  public void sayOk() {
    System.out.println("UserController 的sayOk");
    userService.hi();
  }
}
