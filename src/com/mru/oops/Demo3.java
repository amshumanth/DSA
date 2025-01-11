package com.mru.oops;

public class Demo3 {
	public static void main(String[] args) {
		Adapter adapter = new Adapter();
		Test11 obj1 = adapter.getInstance1();
		String res1 = obj1.msg;
		System.out.println(res1);
		obj1.m1();
		Test12 obj2 = adapter.getInstance2();
		String res2 = obj2.msg;
		System.out.println(res2);
		obj2.m2();
	}

}
