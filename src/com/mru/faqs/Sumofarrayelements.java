package com.mru.faqs;

import java.util.Arrays;

public class Sumofarrayelements {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		int sum = 0;
		
		for(int array : arr) {
			sum += array;
		}
		System.out.println("The sum of array elements : "+sum);

	}

}
