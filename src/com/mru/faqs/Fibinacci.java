package com.mru.faqs;

import java.util.Scanner;

public class Fibinacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of fib series");
		int n = sc.nextInt();
		int[] fib = new int[n];
		
		fib[0] = 0;
		fib[1] = 1;
		
		for(int i=2;i<fib.length;i++) {
			fib[i] = fib[i-1]+fib[i-2];
		}
//		System.out.print(fib[0]+" "+fib[1]+" ");
		for(int element:fib) {
			System.out.print(element+" ");
		}
		
	}

}
