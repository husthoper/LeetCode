package com.xiaomi.luo.Socket;

import java.net.HttpCookie;
import java.util.Random;

import org.junit.Test;

public class test {
	@Test
	public void test()
	{
		for (int i = 0; i < 3; i++) {
			int t = getRandomNumber(1, 22);
			String jsonstr = "{\"result\":[{\"parentLogId\":1,\"answers\":[{\"answerLogId\":" + t + ",\"text\":\"\"}]}]}";
			System.out.println(jsonstr);
		}
	}
	public int getRandomNumber(int min,int max)
	{
		Random rm = new Random();
		int num = rm.nextInt(max-min+1)+min;
		return num;
	}
public static void main(String[] args) {
	HttpCookie hc;
}
}
