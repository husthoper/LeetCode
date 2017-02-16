package com.xiaomi.luo.test;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import org.junit.Test;


import com.xiaomi.luo.Graph.GraphByMatrix;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class testDate {
		public static void main(String[] args) throws ParseException {
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-M-d H:m:s");  
            Date date = dateFormat.parse("2017-1-5 00:00:00"); 
            long compareTime = date.getTime();
            SimpleDateFormat sd = new SimpleDateFormat("yyyy-M-d H:m:s");
            System.out.println(sd.format(new Date(compareTime)));
            System.out.println(compareTime);
			System.out.println(System.currentTimeMillis());
			  System.out.println(sd.format(new Date(System.currentTimeMillis())));
			
		}
		public static void t1(String imeiMD5,String surveyId){
			imeiMD5 = imeiMD5 + "_"+surveyId;
			System.out.println(imeiMD5);
		}
//		@Test
		public void test1(){
			Object a = new Object();
			Object b = new Object();
			System.out.println(a.hashCode());
			System.out.println(b.hashCode());
			String n = new String("Hello");
			String m = new String("Hello");
			System.out.println(m.hashCode());
			System.out.println(n.hashCode());
			boolean result1 = m.equals(n);
			boolean result2 = (m==n);
			System.out.println(result1);
			System.out.println(result2);
		}
		
		public String transferinfo(String info,int type,int length,String name,boolean flag97,boolean flag99){
			if(type==1){
				info += name +",";
			}else{
				for (int i = 0; i < length; i++) {
					int index = i+1;
					if(flag99==true){
						if(i==(length-2)){
							index = 99;
						}
					}
					if(flag97==true){
						if(i==(length-1)){
							index = 97;
						}
					}
					info += name + "_" + index + ",";
				}
			}
			return info;
		}
//		@Test
		public void test2(){
			String info = "imeiMD5,"+"S1,";
			info = transferinfo(info, 2, 7, "A1",true,true);
			info = transferinfo(info, 2, 21, "A2",true,false);
			info = transferinfo(info, 1, 0, "A3",false,false);
			info = transferinfo(info, 2, 35, "A4",true,false);
			info = transferinfo(info, 2, 18, "A5",true,false);
			info = transferinfo(info, 1, 0, "A6",true,false);
			info = transferinfo(info, 1, 0, "A7",true,false);
			info = transferinfo(info, 1, 0, "A8",true,false);
			info = transferinfo(info, 2, 13, "A9",true,false);
			info = transferinfo(info, 1, 0, "A10",true,false);
			info = transferinfo(info, 1, 0, "A11",true,false);
			info = transferinfo(info, 2, 33, "A12",true,false);
			info = transferinfo(info, 1, 0, "A13",true,false);
			info = transferinfo(info, 1, 0, "A14",true,false);
			info = transferinfo(info, 2, 10, "B1",true,true);
			info = transferinfo(info, 1, 0, "B2",true,false);
			info = transferinfo(info, 1, 0, "B3",true,false);
			info = transferinfo(info, 1, 0, "B4",true,false);
			info = transferinfo(info, 2, 6, "B5",true,false);
			info = transferinfo(info, 2, 7, "B6",true,false);
			info = transferinfo(info, 1, 0, "B7",true,false);
			info = transferinfo(info, 1, 0, "H1",true,false);
			info = transferinfo(info, 1, 0, "H2",true,false);
			info = transferinfo(info, 1, 0, "H3",true,false);
			info = transferinfo(info, 1, 0, "H4",true,false);
			info = transferinfo(info, 1, 0, "H5",true,false);
			info = transferinfo(info, 1, 0, "H6",true,false);
			info = transferinfo(info, 1, 0, "H7",true,false);
			info = transferinfo(info, 1, 0, "H8",true,false);
			info = transferinfo(info, 1, 0, "H9",true,false);
			info = info + "StartTime,"+"EndTime";
			System.out.println(info);
		}
		
		@Test
		public void test3() {
			String filename = "C:/bobo/文档/小蜜蜂/Comic/Growth";
			Date date = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-M-d");  
			System.out.println(dateFormat.format(date));
			filename += dateFormat.format(date) +".csv";
			System.out.println(filename);
		}
}
