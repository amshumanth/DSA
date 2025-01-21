package com.mru.oops;

public class AdditionImplementation implements Addition {

	@Override
	public void add1() {
		// TODO Auto-generated method stub
		int num1 = 200;
		int num2 = 100;
		int res = num1+num2;
		System.out.println(res);

	}

	@Override
	public void add2(int num1, int num2) {
		// TODO Auto-generated method stub
		int res = num1+num2;
		System.out.println(res);

	}

	@Override
	public int add3() {
		// TODO Auto-generated method stub
		int num1 = 200;
		int num2 = 100;
		int res = num1+num2;
		return res;
	}

	@Override
	public int add4(int num1, int num2) {
		// TODO Auto-generated method stub
		int res = num1+num2;
		return res;
	}

}
