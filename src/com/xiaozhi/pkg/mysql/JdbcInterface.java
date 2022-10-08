package com.xiaozhi.pkg.mysql;

public interface JdbcInterface {
  public Object getConnection();

  public void crud();

  public void close();

}
