package com.xiaomi.luo.Socket;

import java.net.*;

import org.junit.Test;

import java.io.*;
/**
 * 检查端口是否已经使用 
 * @author mi
 *
 */
public class Main {
   public static void main(String[] args) 
   {
      Socket Skt;
      String host = "localhost";
      if (args.length > 0) {
         host = args[0];
      }
      for (int i = 0; i < 1024; i++) {
         try {
            System.out.println("查看 "+ i);
            Skt = new Socket(host, i);
            System.out.println("端口 " + i + " 已被使用");
         }
         catch (UnknownHostException e) {
            System.out.println("Exception occured"+ e);
            break;
         }
         catch (IOException e) {
         }
      }
   }
   public void getLocalAddress() throws Exception 
   {
	     InetAddress addr = InetAddress.getLocalHost();
	     System.out.println("Local HostAddress:"+addr.getHostAddress());
	     String hostname = addr.getHostName();
	     System.out.println("Local host name: "+hostname);
   }
   public void getRemoteFile() throws Exception 
   {
	      int size;
	      URL url = new URL("http://www.runoob.com/wp-content/themes/runoob/assets/img/newlogo.png");
	      URLConnection conn = url.openConnection();
	      size = conn.getContentLength();
	      if (size < 0)
	          System.out.println("无法获取文件大小。");
	      else
	        System.out.println("文件大小为：" + size + " bytes");
	      conn.getInputStream().close();
   }
   @Test
   public void test() throws Exception 
   {
	   getRemoteFile();
   }
}