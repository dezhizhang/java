package com.xiaozhi.pkg.reflection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

@SuppressWarnings({"all"})
public class Reflection01 {
  public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
    Properties properties = new Properties();
    properties.load(new FileInputStream("./refect.properties"));
    String classFullPath = properties.getProperty("classfullpath").toString();
    String methodName = properties.getProperty("method").toString();

    System.out.println(classFullPath);
    System.out.println(methodName);
    Class clazz = Class.forName(classFullPath);
    Object o = (Cat) clazz.newInstance();
    Method method = clazz.getMethod(methodName);
    method.invoke(o);

  }
}
