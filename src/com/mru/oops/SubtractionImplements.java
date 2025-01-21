package com.mru.oops;

public class SubtractionImplements extends AdditionImplementation implements Subtration {

	@Override
	public void subtraction1() {
		int num1 = 200;
		int num2 = 100;
		int res = num1-num2;
		System.out.println(res);

	}

	@Override
	public void subtraction2(int num1, int num2) {
		int res = num1-num2;
		System.out.println(res);

	}

	@Override
	public int subtraction3() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int subtraction4(int num1, int num2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
