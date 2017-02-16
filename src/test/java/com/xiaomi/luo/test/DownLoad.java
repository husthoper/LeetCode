package com.xiaomi.luo.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class DownLoad {   
	      public static void main(String[] args) {   
	        String urlPath = "http://10.99.184.145:8098/home/work/bin/miui_ad_user_profile_web/autoResultWithThread.csv";   
	          try {   
	              downloadFile(urlPath,"C:/bobo/文档/小蜜蜂/Comic");   
	           } catch (IOException e) {   
	            e.printStackTrace();   
	         }   
	      }   
	 
	      public static void downloadFile(String url, String filePath) throws IOException 
	      { 
	      URL theURL = new URL(url); 
	      URLConnection con = theURL.openConnection(); 
	      String urlPath = con.getURL().getFile(); 
	      String fileFullName = urlPath.substring(urlPath.lastIndexOf("/")+1); 
	      if(fileFullName !=null){ 
	      byte[] buffer = new byte[4*1024]; 
	      int read; 
	      String path = filePath + "/" +fileFullName; 
	      File fileFolder = new File(filePath); 
	      if(!fileFolder.exists()){ 
	      fileFolder.mkdirs(); 
	      } 
	      InputStream in = con.getInputStream(); 
	      FileOutputStream os = new FileOutputStream(path); 
	      while((read = in.read(buffer)) > 0){ 
	      os.write(buffer, 0, read); 
	      } 
	      os.close(); 
	      in.close(); 
	      } 
	      }
	}