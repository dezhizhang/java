package com.xiaozhi.mhl.dao;

import com.xiaozhi.pkg.utils.JDBCUtilsByDruid;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.util.List;

public class BaseDao<T> {
  private QueryRunner queryRunner = new QueryRunner();

  //添加DML操作
  public int update(String sql, Object... params) {
    Connection connection = null;
    try {
      connection = JDBCUtilsByDruid.getConnection();
      int update = queryRunner.update(connection, sql, params);
      return update;
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      JDBCUtilsByDruid.close(null, null, connection);
    }
  }

  // 返回多个对像
  public List<T> queryMulti(String sql, Class<T> clazz, Object... params) {
    Connection connection = null;
    try {
      connection = JDBCUtilsByDruid.getConnection();
      return queryRunner.query(connection, sql, new BeanListHandler<T>(clazz), params);

    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      JDBCUtilsByDruid.close(null, null, null);
    }
  }

  // 返回单条记录
  public T querySingle(String sql, Class<T> clazz, Object... params) {
    Connection connection = null;
    try {
      connection = JDBCUtilsByDruid.getConnection();
      return queryRunner.query(connection, sql, new BeanHandler<T>(clazz), params);

    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      JDBCUtilsByDruid.close(null, null, connection);
    }
  }

  // 查询返回单行单列
  public Object queryScalar(String sql, Object params) {
    Connection connection = null;
    try {
      connection = JDBCUtilsByDruid.getConnection();
      return queryRunner.query(connection, sql, new ScalarHandler(), params);
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      JDBCUtilsByDruid.close(null, null, connection);
    }
  }

}
