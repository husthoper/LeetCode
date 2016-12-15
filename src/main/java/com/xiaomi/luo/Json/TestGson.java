package com.xiaomi.luo.Json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

import com.google.gson.Gson;

import net.sf.json.JSONObject;

public class TestGson {
    static  Gson gson = new Gson();

    public static void main(String[] args) {
	
	String json = "{\"hostName\":\"host-2\",\"ip\":\"192.168.136.134\"}";
	int testNum = 1000000;

	System.out.println(" ------------ ");
	long start = System.currentTimeMillis();
	for (int i = 0; i < testNum; i++)
	    Entity2json("host-1", "192.168.136.1");
	long end = System.currentTimeMillis();
	System.out.println("实体转换成json，" + testNum + "次耗时: "
		+ ((end - start) / 1000.0) + " seconds");

	System.out.println("");
	System.out.println(" ------------ ");
	start = System.currentTimeMillis();
	for (int i = 0; i < testNum; i++)
	    list2Json();
	end = System.currentTimeMillis();
	System.out.println("List转换成json，" + testNum + "次耗时: "
		+ ((end - start) / 1000.0) + " seconds");
	System.out.println("");

	System.out.println(" ------------ ");
	start = System.currentTimeMillis();
	for (int i = 0; i < testNum; i++)
	    Complexdata();
	end = System.currentTimeMillis();
	System.out.println("复杂对象转换成json，" + testNum + "次耗时: "
		+ ((end - start) / 1000.0) + " seconds");
	System.out.println("");

	System.out.println(" ------------ ");
	start = System.currentTimeMillis();
	for (int i = 0; i < testNum; i++)
	    Json2Entity(json);
	end = System.currentTimeMillis();
	System.out.println("json转换为实体，" + testNum + "次耗时: "
		+ ((end - start) / 1000.0) + " seconds");
	System.out.println("");
	
    }

	// 实体转为Json
    public static void Entity2json(String Name, String Ip) {
	HostInfo info = new HostInfo(Name, Ip);
	String str_json = gson.toJson(info); //

    }

    // list转Json
    public static void list2Json() {
	List<HostInfo> list = new ArrayList<HostInfo>();
	HostInfo host8 = new HostInfo("host-8", "192.168.136.158");
	HostInfo host9 = new HostInfo("host-9", "192.168.136.159");
	list.add(host8);
	list.add(host9);
	String json = gson.toJson(list);

    }

    // 复杂数据类型转化为Json
    public static void Complexdata() {
	HashMap<String, Object> map = new HashMap<String, Object>();
	map.put("name", "张三");
	map.put("age", 24);
	map.put("phone", "13799313810");

	// map集合
	HashMap<String, Object> temp = new HashMap<String, Object>();
	temp.put("name", "李四");
	temp.put("age", "23");
	map.put("girlInfo", temp);

	// list集合
	List<String> list = new ArrayList<String>();
	list.add("编码");
	list.add("测试");
	list.add("需求");
	map.put("hobby", list);

	String jsonString = gson.toJson(map);

    }


    // Json转为实体
    private static void Json2Entity(String json) {
	HostInfo host1 = gson.fromJson(json, HostInfo.class);
    }
    
}