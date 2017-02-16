package com.xiaomi.luo.Algorithm;

import java.math.BigInteger;

import org.junit.Test;

public class TimeComplexity {
	
	@Test
	public void multiplay(){
		long firstOperand = 1756200000000L;
		long secondOperand = 110000000000L;
		long product = 0;
		for (long counter = secondOperand;counter > 0;counter--) {
			product = product + firstOperand;
		}
		System.out.println(product);
	}
}
