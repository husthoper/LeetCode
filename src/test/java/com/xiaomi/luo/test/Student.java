package com.xiaomi.luo.test;

import java.util.HashMap;
import java.util.Map;

public class Student {
		String id;
		String name;
		public Student(String id,String name) {
			this.id = id;
			this.name = name;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
			return "id = " + id + ";name = " + name; 
		}
		@Override
		public int hashCode() {
			return id.hashCode();
		}
		@Override
		public boolean equals(Object obj) {
			Student s = (Student)obj;
			if(s.id.equals(this.id)){
				return true;
			}else{
				return false;
			}
		}
		
		public static void main(String[] args) {
			Integer a = 1;
				System.out.println(a!=1);
				String b = "";
				System.out.println(b.equals(""));
		}
}
