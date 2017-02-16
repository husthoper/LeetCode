package com.xiaomi.luo.Json;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class TestAboutJson {
	static String json = "{\"result\":{\"question\":\"B1\",\"answers\":[{\"code\":2,\"text\":\"否\"},{\"code\":3,\"text\":\"\"}]}}";
	static Gson gson = new Gson();

	public static void main(String[] args) {
		int testNum = 1000000;
		
		System.out.println(" ------------ ");
		long start = System.currentTimeMillis();
		for (int i = 0; i < testNum; i++)
		    Json2Gson(json);
		long end = System.currentTimeMillis();
		System.out.println("通过gson解析" + testNum + "次耗时: "
			+ ((end - start) / 1000.0) + " seconds");
		System.out.println("");
		
		System.out.println(" ------------ ");
		start = System.currentTimeMillis();
		for (int i = 0; i < testNum; i++)
		    Json2fastJson(json);
		end = System.currentTimeMillis();
		System.out.println("通过fastJson解析" + testNum + "次耗时: "
			+ ((end - start) / 1000.0) + " seconds");
		System.out.println("");
		
		System.out.println(" ------------ ");
		 start = System.currentTimeMillis();
		for (int i = 0; i < testNum; i++)
		    Json2Jsonlib(json);
		end = System.currentTimeMillis();
		System.out.println("通过json-lib解析" + testNum + "次耗时: "
			+ ((end - start) / 1000.0) + " seconds");
		System.out.println("");
		
}
	private static void Json2Jsonlib(String json) {
    	JSONObject jo = JSONObject.fromObject(json);
    	JSONObject ja = (JSONObject) jo.get("result");
    	JSONArray answerArray = JSONArray.fromObject(ja.get("answers")); 
    	List<Integer> answerIdList = new ArrayList<Integer>();
    	for (int i = 0; i < answerArray.size(); i++) {
			JSONObject answer = answerArray.getJSONObject(i);
			answerIdList.add((Integer) answer.get("code"));
		}
	}
	
	private static void Json2Gson(String json){
		JsonObject jsonObject = gson.fromJson(json, JsonObject.class);
		JsonObject result = (JsonObject) jsonObject.get("result");
		JsonArray answerArray = (JsonArray) result.get("answers");
		List<Integer> answerIdList = new ArrayList<Integer>();
		for (int i = 0; i < answerArray.size(); i++) {
			JsonObject answer = (JsonObject) answerArray.get(i);
			answerIdList.add(answer.get("code").getAsInt());
		}
	}
	
	private static void Json2fastJson(String json){
		com.alibaba.fastjson.JSONObject jsonObject = JSON.parseObject(json);
		com.alibaba.fastjson.JSONObject result = jsonObject.getJSONObject("result");
		com.alibaba.fastjson.JSONArray answerArray = result.getJSONArray("answers");
		List<Integer> answerIdList = new ArrayList<Integer>();
		for (int i = 0; i < answerArray.size(); i++) {
			com.alibaba.fastjson.JSONObject answer = answerArray.getJSONObject(i);
			answerIdList.add(answer.getInteger("code"));
		}
	}
}
