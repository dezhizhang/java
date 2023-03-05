package com.spring.factory;

import com.spring.bean.Monster;

import java.util.HashMap;
import java.util.Map;

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
