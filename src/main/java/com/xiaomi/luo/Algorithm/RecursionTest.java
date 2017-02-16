package com.xiaomi.luo.Algorithm;

import org.junit.Test;

public class RecursionTest {
	
	public static void countDown(int integer){
		if(integer==1){
			System.out.println(integer);
		}
		else{
			System.out.println(integer);
			countDown(integer-1);
		}
	}
	
	/**
	 * @param n 大于0的整数
	 * @return	1+2+...+n的和
	 */
	public static int sumOf(int n)
	{
		int sum;
		if(n == 1)
			sum = 1;		//基本情况
		else
			sum = sumOf(n-1) + n;	//递归调用
		return sum;
	}
	
	public static int multiplynumber(int n){
		int result = 1;
		if(n > 1){
			result = n*multiplynumber(n-1);
		}
		return result;
	}
	
	/**Task:显示一个数组中的整数
	 * @param array  一个整数数组
	 * @param first	 待显示的第一个元素的索引
	 * @param last	待显示的最后一个元素的索引
	 */
	public static void displayArray(int[] array,int first,int last)
	{
		if(first==last)
			System.out.println(array[first]);
		else
		{
			int mid = (first+last)/2;
			displayArray(array, first, mid);
			displayArray(array, mid+1, last);
		}
	}
	
	public void displayChain(Node nodeOne){
		if(nodeOne != null)
		{
			System.out.println(nodeOne.data);
			displayChain(nodeOne.next);
		}
	}
	@Test
	public void test(){
//		countDown(10);
		System.out.println(sumOf(3));
	}
}
