package com.spring.bean;

import java.util.*;

public class Master {
  private String name;
  private List<Monster> monsterList;
  private Map<String, Master> masterMap;
  private Set<Master> masterSet;
  private String[] masterName;
  private Properties props;

  public Master() {
  }

  public Master(String name,List<Monster> masterList, Map<String,Master> masterMap,Set<Master> masterSet,String[] masterName,Properties props) {
    this.name = name;
    this.monsterList = masterList;
    this.masterMap = masterMap;
    this.masterName = masterName;
    this.props = props;
    this.masterSet = masterSet;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Monster> getMonsterList() {
    return monsterList;
  }

  public void setMonsterList(List<Monster> monsterList) {
    this.monsterList = monsterList;
  }

  public Map<String, Master> getMasterMap() {
    return masterMap;
  }

  public void setMasterMap(Map<String, Master> masterMap) {
    this.masterMap = masterMap;
  }

  public Set<Master> getMasterSet() {
    return masterSet;
  }

  public void setMasterSet(Set<Master> masterSet) {
    this.masterSet = masterSet;
  }

  public void setMasterName(String[] masterName) {
    this.masterName = masterName;
  }

  public String[] getMasterName() {
    return masterName;
  }

  public void setProps(Properties props) {
    this.props = props;
  }

  public Properties getProps() {
    return props;
  }

  @Override
  public String toString() {
    return "Master{" +
      "name='" + name + '\'' +
      ", monsterList=" + monsterList +
      ", masterMap=" + masterMap +
      ", masterSet=" + masterSet +
      ", masterName=" + Arrays.toString(masterName) +
      ", props=" + props +
      '}';
  }
}
