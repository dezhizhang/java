package com.spring.factory;

import com.spring.bean.Monster;
import java.util.Map;
import org.springframework.beans.factory.FactoryBean;

import java.util.HashMap;

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
