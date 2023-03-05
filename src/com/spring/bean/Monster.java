package com.spring.bean;

public class Monster {

  private Integer monsterId;
  private String name;
  private String skill;

  public Monster() {

  }

  public Monster(Integer monsterId, String name, String skill) {
    this.monsterId = monsterId;
    this.name = name;
    this.skill = skill;

  }

  public void setMonsterId(Integer monsterId) {
    this.monsterId = monsterId;
  }

  public Integer getMonsterId() {
    return monsterId;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setSkill(String skill) {
    this.skill = skill;
  }

  public String getSkill() {
    return skill;
  }

  @Override
  public String toString() {
    return "Monster{" +
      "monsterId=" + monsterId +
      ", name='" + name + '\'' +
      ", skill='" + skill + '\'' +
      '}';
  }
}
