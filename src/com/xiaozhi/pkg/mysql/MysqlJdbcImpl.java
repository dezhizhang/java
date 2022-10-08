package com.xiaozhi.pkg.mysql;

public class MysqlJdbcImpl implements JdbcInterface {

  @Override
  public Object getConnection() {
    System.out.println("得到mysql连接");
    return null;
  }

  @Override
  public void crud() {
    System.out.println("完成mysql增册改查");
  }

  @Override
  public void close() {
    System.out.println("关闭mysql边接");
  }
}
