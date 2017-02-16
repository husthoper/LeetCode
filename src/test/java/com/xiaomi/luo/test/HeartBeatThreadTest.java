package com.xiaomi.luo.test;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

public class HeartBeatThreadTest {
	private ScheduledExecutorService executorService;
	private Thread heartBeatThread;
		@Test
		public void test() throws Exception {
			Runnable1 r = new Runnable1();
			heartBeatThread = new Thread(r);
			executorService = Executors.newSingleThreadScheduledExecutor();
			executorService.scheduleAtFixedRate(heartBeatThread, 0, 30, TimeUnit.SECONDS);
			Thread.sleep(100000);
		}
		class Runnable1 implements Runnable{
			public void run(){
				System.out.println("欢迎您的到来");
			}
		}
}
