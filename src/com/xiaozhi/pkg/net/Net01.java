package com.xiaozhi.pkg.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Net01 {
  public static void main(String[] args) throws UnknownHostException {
    //获取本地的
    InetAddress localHost = InetAddress.getLocalHost();
    System.out.println(localHost);

    InetAddress byName = InetAddress.getByName("192.168.1.102");
    System.out.println(byName);
    // 根扭域名返回
    InetAddress byName1 = InetAddress.getByName("www.baidu.com");
    System.out.println(byName1);

    //
    String hostAddress = byName1.getHostAddress();
    System.out.println(hostAddress);

    String hostName = byName1.getHostName();
    System.out.println(hostName);


  }
}
