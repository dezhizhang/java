package com.spring.test;

import com.spring.bean.Cat;
import com.spring.bean.House;
import com.spring.bean.Master;
import com.spring.bean.Monster;
import com.spring.component.UserController;
import com.spring.component.UserDao;
import com.spring.component.UserService;
import com.spring.depinjection.PhoneService;
import com.spring.service.MemberServiceImpl;
import com.spring.web.OrderAction;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class SpringBeanTest {

  @Test
  public void getMonster() {
    ApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
    Monster monster = ioc.getBean("monster01", Monster.class);
    System.out.println(monster);

    // 查看容器注入那些对像
    String[] definitionNames = ioc.getBeanDefinitionNames();
    for (String definitionName : definitionNames) {
      System.out.println(definitionName);
    }
  }

  //类加载路径
  @Test
  public void classPath() {
    File file = new File(this.getClass().getResource("/").getPath());
    System.out.println("file=" + file);

  }

  //通过类型来加载bean
  @Test
  public void getBeanByType() {
    ApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
    Monster monster = ioc.getBean(Monster.class);

    System.out.println(monster);
  }

  // 通过构建器配置bean
  @Test
  public void setBeanConstructor() {
    ApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
    Monster monster = ioc.getBean("monster02", Monster.class);

    System.out.println(monster);
  }

  // 通过p名称空间来配置bean
  @Test
  public void setBeanByNamespace() {
    ApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
    Monster monster = ioc.getBean("monster03", Monster.class);

    System.out.println(monster);
  }

  @Test

  public void setBeanByRef() {
    ApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
    MemberServiceImpl memberService = ioc.getBean("memberService", MemberServiceImpl.class);
    memberService.add();

  }

  @Test

  public void setInsertBy() {
    ApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
    MemberServiceImpl memberService = ioc.getBean("memberService2", MemberServiceImpl.class);
    memberService.add();
  }

  // 给集膈或数组属性赋值
  @Test
  public void setBeanByCollection() {
    ApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
    Master master = ioc.getBean("master", Master.class);
    System.out.println(master);
  }

  @Test
  public void setBeanByMap() {
    ApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
    Master master = ioc.getBean("master", Master.class);
    System.out.println(master);
  }

  @Test
  public void getBeanByStaticFactory() {
    ApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");

    Monster my_monster01 = ioc.getBean("my_monster01", Monster.class);
    System.out.println("my_monster01=" + my_monster01);

  }

  @Test
  public void getBeanByInstanceFactory() {
    ApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
    Monster my_monster03 = ioc.getBean("my_monster02", Monster.class);
    System.out.println("my_monster03=" + my_monster03);
  }

  @Test
  public void  getBeanByFactory() {
    ApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
    Monster my_monster03 = ioc.getBean("my_monster03", Monster.class);
    System.out.println("my_monster03=" + my_monster03);
  }

  @Test
  public void getBeanSingle() {
    ApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
    Cat cat = ioc.getBean("cat",Cat.class);
    System.out.println(cat);
  }

  @Test
  public void getBeanLifeCycle() {
    ApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
    House house = ioc.getBean("house",House.class);

    ((ConfigurableApplicationContext) ioc).close();
    System.out.println(house);
  }

  @Test
  public void testBeanProperty() {
    ApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
    Monster monster = ioc.getBean("monster",Monster.class);
    System.out.println(monster);
  }

  @Test
  public void testBeanAutowire() {
    ApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
    OrderAction orderAction = ioc.getBean("orderAction",OrderAction.class);

    System.out.println(orderAction.getOrderService());
    System.out.println(orderAction.getOrderService().getOrderDao());
  }

  // 通过注解配置bean
  @Test
  public void setBeanByAnnotation() {
    ApplicationContext ioc = new ClassPathXmlApplicationContext("beans01.xml");

    UserDao userDao = ioc.getBean(UserDao.class);
    UserService userService = ioc.getBean(UserService.class);
    UserController userController = ioc.getBean(UserController.class);


    System.out.println("userDao=" + userDao);
    System.out.println("userService" + userService);
    System.out.println("userController" + userController);

  }

  @Test
  public void setProByAutowired() {
    ApplicationContext ioc = new ClassPathXmlApplicationContext("beans02.xml");
    UserController userController = ioc.getBean("userController",UserController.class);
    userController.sayOk();
    System.out.println("userController=" + userController);
  }


  @Test
  public void setProByDependcyInjction() {
    ApplicationContext ioc = new ClassPathXmlApplicationContext("beans02.xml");

    PhoneService phoneService = ioc.getBean("phoneService",PhoneService.class);

    phoneService.save();

    System.out.println("ok" + ioc);
  }



}
