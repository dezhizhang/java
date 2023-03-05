package com.spring.service;

import com.spring.dao.MemberDaoImpl;

public class MemberServiceImpl {
  private MemberDaoImpl memberDao;

  public MemberDaoImpl getMemberDao() {
    return memberDao;
  }

  public void setMemberDao(MemberDaoImpl memberDao) {
    this.memberDao = memberDao;
  }

  public void add() {
    System.out.println("service中的add被调用");
    memberDao.add();
  }


}
