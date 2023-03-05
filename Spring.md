# Spring

### ioc

```
package com.spring.test;

import com.spring.bean.Monster;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
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
}

```

### 通过类型来加载bean

```
  public void getBeanByType() {
    ApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
    Monster monster = ioc.getBean(Monster.class);
    System.out.println(monster);
  }
```

### 通过构建器配置bean

```
  public void setBeanConstructor() {
    ApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
    Monster monster = ioc.getBean("monster02", Monster.class);
    System.out.println(monster);

  }

```

### 通过p名称空间来配置bean

```
  public void setBeanByNamespace() {
    ApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
    Monster monster = ioc.getBean("monster03",Monster.class);

    System.out.println(monster);
  }
```

### 通过ref来配置bean

```
  <!--配置dao对像-->
  <bean class="com.spring.dao.MemberDaoImpl" id="memberDao"/>
  <!--配置service对像-->
  <bean class="com.spring.service.MemberServiceImpl" id="memberService">
    <property name="memberDao" ref="memberDao"/>
  </bean>
  
  public void  setBeanByRef() {
    ApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
    MemberServiceImpl memberService = ioc.getBean("memberService", MemberServiceImpl.class);
    memberService.add();

  }


```
