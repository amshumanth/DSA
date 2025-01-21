package com.mru.oops;

public class Oops1 {

	public static void main(String[] args) {
		SubChild obj = new SubChild();
		obj.m1();
		
		obj.m2("oops");
		
		String res1 = obj.m3();
		System.out.println(res1);
		
		String res2 = obj.m4("oops4");
		System.out.println(res2);

	}

}
