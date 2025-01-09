package com.mru.logics;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int num = 123;
		int x = num;
		int rev = 0;
		
		while (num != 0) {
			int last = num % 10;
			rev = rev*10 + last;
			num = num/10; //deleting the last element
		}
		
		System.out.println(rev);
		
		if(x == rev) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}

	}

}
