package com.luo.LeetCode;

import org.junit.Test;

/**
 * target:Count the number of prime numbers less than a non-negative number n
 * @author lrb
 * 
 */
public class CountPrimers {
	//O(n2),cost too much time
	public int simplecountPrimes(int n) {
		int num = 0;
		for (int i = 2; i < n; i++) {
			boolean flag = isPrimer(i);
			if(flag == true){
				num++;
			}
		}
		return num;
	  }
	public boolean isPrimer(int m){
		boolean flag = true;
		for (int i = 2; i < m; i++) {
			int remainder = m%i;
			if(remainder==0){
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	//Sieve of Eratosthenes, O(nlglgn)
	public int countPrimers(int n){
		int num = 0;
		boolean[] isPrimers = new boolean[n];
		for (int i = 0; i < isPrimers.length; i++) {
			isPrimers[i] = true;
		}
		for (int i = 2; i*i < n; i++) {
			if(!isPrimers[i]){
				continue;
			}
			for(int j = i*i;j < n ;j += i){
				isPrimers[j] = false;
			}
		}
		for (int i = 2; i < n; i++) {
			if(isPrimers[i] == true){
				num++;
			}
		}
		return num;
	}

	@Test
	public void test(){
//		int result = simplecountPrimes(499979);
		int result2 = countPrimers(200);
		System.out.println(result2);
	}
}
