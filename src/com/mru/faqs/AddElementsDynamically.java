package com.mru.faqs;

import java.util.Scanner;

public class AddElementsDynamically {

	public static void main(String[] args) {
		System.out.println("Enter array length");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter array element for "+i+"th position");
			arr[i] = sc.nextInt();
		}
		
		//display array
		for(int element:arr) {
			System.out.print(element+" ");
		}

	}

}
