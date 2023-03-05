package com.spring.factory;

import com.spring.bean.Monster;

import java.util.HashMap;
import java.util.Map;

public class MyStaticFactory {

  private static Map<String, Monster> monsterMap;

  static {
    monsterMap = new HashMap<>();
    monsterMap.put("monster01", new Monster(100, "牛魔王", "巨贪"));
    monsterMap.put("monster02", new Monster(200, "孤狸精", "美人计"));
  }

  public static Monster getMonster(String key) {
    return monsterMap.get(key);
  }

}
