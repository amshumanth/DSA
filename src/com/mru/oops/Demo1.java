package com.mru.oops;

public class Demo1 {

	public static void main(String[] args) {
		Test1 obj1 = new Test1();
		obj1.addition();
		
		int res1 = obj1.subtraction(100,50);
		System.out.println("Subtraction..."+res1);
		
		obj1.multiplication(100,50);
		
		int res2 = obj1.division();
		System.out.println("Division..."+res2);
	}

}
