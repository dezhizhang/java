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

### 使用内部bean

```
  <bean class="com.spring.service.MemberServiceImpl" id="memberService2">
    <property name="memberDao">
      <bean class="com.spring.dao.MemberDaoImpl"></bean>
    </property>
  </bean>
  public void setInsertBy() {
    ApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
    MemberServiceImpl memberService = ioc.getBean("memberService2",MemberServiceImpl.class);
    memberService.add();
  }
```

### 通过静态工厂

```
  <!--通过静态工厂-->
  <bean id="my_monster01" class="com.spring.factory.MyStaticFactory" factory-method="getMonster">
    <constructor-arg value="monster01"/>
  </bean>
  
  public class MyStaticFactory {
  
    private static Map<String, Monster> monsterMap;
  
    static {
      monsterMap = new HashMap<>();
      monsterMap.put("monster01", new Monster(100, "牛魔王", "巨贪"));
      monsterMap.put("monster01", new Monster(200, "孤狸精", "美人计"));
    }
  
    public static Monster getMonster(String key) {
      return monsterMap.get(key);
    }
  
  }

  
  public void getBeanByStaticFactory() {
    ApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");

    Monster my_monster01 = ioc.getBean("my_monster01", Monster.class);
    System.out.println("my_monster01=" + my_monster01);

  }
```
### 实例工厂
```
  <!--配置实例工厂对像-->
  <bean class="com.spring.factory.MyInstanceFactory" id="myInstanceFactory"/>
  <!--通过实例工厂-->
  <bean id="my_monster02" factory-bean="myInstanceFactory" factory-method="getMonster">
    <constructor-arg value="monster03"/>
  </bean>
  
  public class MyInstanceFactory {
    private Map<String, Monster> monsterMap;
  
    {
      monsterMap = new HashMap<>();
      monsterMap.put("monster03", new Monster(300, "牛魔王~", "巨贪~"));
      monsterMap.put("monster04", new Monster(400, "孤狸精~", "美人计~"));
    }
  
    public Monster getMonster(String key) {
      return monsterMap.get(key);
    }
  }
  
  public void getBeanByInstanceFactory() {
    ApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
    Monster my_monster03 = ioc.getBean("my_monster02", Monster.class);
    System.out.println("my_monster03=" + my_monster03);
  }
```
### 通过factory来获取bean
```
  <!--通过factoryBean获取-->
  <bean id="my_monster03" class="com.spring.factory.MyFactoryBean">
    <property name="key" value="monster06"/>
  </bean>
  
  public class MyFactoryBean implements FactoryBean<Monster> {
    private String key;
  
    private Map<String,Monster> monsterMap;
  
    {
      monsterMap = new HashMap<>();
      monsterMap.put("monster05", new Monster(300, "牛魔王~", "巨贪~"));
      monsterMap.put("monster06", new Monster(400, "孤狸1111", "美人计111"));
    }
  
    @Override
    public Monster getObject() throws Exception {
      return monsterMap.get(key);
    }
  
    @Override
    public Class<?> getObjectType() {
      return Monster.class;
    }
  
    @Override
    public boolean isSingleton() {
      return FactoryBean.super.isSingleton();
    }
  
    public void setKey(String key) {
      this.key = key;
    }
  
    public String getKey() {
      return key;
    }
  }
  
  public void  getBeanByFactory() {
    ApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
    Monster my_monster03 = ioc.getBean("my_monster03", Monster.class);
    System.out.println("my_monster03=" + my_monster03);
  }
    
```
