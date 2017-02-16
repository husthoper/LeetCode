package com.luo.LeetCode;

import org.junit.Test;

/**
 * @target 8:String to Integer 
 * @author luo
 * 1.null & empty  2.+ & -  3.white space
 * 4.max and min of integer 5. 
 */ 
public class atoi {
	 public int myAtoi(String str) {
	        // Start typing your Java solution below
	        // DO NOT write main() function
	        if(str == null) {
	            return 0;
	        }
	        str = str.trim();
	        if (str.length() == 0) {
	            return 0;
	        }
	            
	        int sign = 1;
	        int index = 0;
	    
	        if (str.charAt(index) == '+') {
	            index++;
	        } else if (str.charAt(index) == '-') {
	            sign = -1;
	            index++;
	        }
	        long num = 0;
	        for (; index < str.length(); index++) {
	            if (str.charAt(index) < '0' || str.charAt(index) > '9')
	                break;
	            num = num * 10 + (str.charAt(index) - '0');
	            if (num > Integer.MAX_VALUE ) {
	                break;
	            }
	        }   
	        if (num * sign >= Integer.MAX_VALUE) {
	            return Integer.MAX_VALUE;
	        }
	        if (num * sign <= Integer.MIN_VALUE) {
	            return Integer.MIN_VALUE;
	        }
	        return (int)num * sign;
	    }

	 public int luoAtoi(String str){
		if(str==null){
			return 0;
		 }
		str = str.trim();
		if(str.length()==0){
			return 0;
		}
		long result = 0;
		int flag = 1;	//标记正负	
		int i = 0;	    //索引
		if(str.charAt(i) == '+'){
			i++;			
		}
		else if(str.charAt(i) == '-'){
			i++;
			flag = -1;
		}
		for(;i<str.length();i++){
			if((str.charAt(i)<'0')||(str.charAt(i)>'9')){
				break;
			}
			else{
				result = result*10 + (str.charAt(i) - '0');
			}
			if(result>Integer.MAX_VALUE){
				break;
			}
		}
		result = result*flag;
		if(result >= Integer.MAX_VALUE){
			return Integer.MAX_VALUE;
		}
		if(result <= Integer.MIN_VALUE){
			return Integer.MIN_VALUE;
		}
		return (int)result;
	 }
	 @Test
	 public void test(){
		 int a = luoAtoi("+-2");
		 int b = myAtoi("+-2");
		 System.out.println(a);
		 System.out.println(b);
	 }
}
