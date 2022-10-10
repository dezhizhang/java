package com.xiaozhi.pkg.dao;

import com.xiaozhi.pkg.utils.JDBCUtilsByDruid;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.Connection;

public class BaseDao<T> {
  private QueryRunner queryRunner = new QueryRunner();

  //添加DML操作
  public int update(String sql,Object ...params) {
    Connection connection = null;
    try{
      connection = JDBCUtilsByDruid.getConnection();
      int update = queryRunner.update(connection,sql,params);
      return update;
    } catch (Exception e) {
      throw  new RuntimeException(e);
    } finally {
      JDBCUtilsByDruid.close(null,null,connection);
    }
  }
}
