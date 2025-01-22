package com.mru.faqs;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		//read number dynamically
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		
		int original_num = num;
		
		//read no of digits
		int digits = String.valueOf(num).length();    //153 --- 3 1634 ----4
		
		int sum = 0;
		while (num!=0) {
			int last = num%10;
			sum+=Math.pow(last,digits);
			num=num/10;
		}
		System.out.println(original_num == sum ? "Armstrong !!!":"Not Armstrong !!!"); //logic original_num == sum

	}

}
