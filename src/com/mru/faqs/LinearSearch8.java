package com.mru.faqs;

public class LinearSearch8 {
	
	public static int linear_search(int[] arr,int search_element) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == search_element) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int res = linear_search(new int[] {10,20,30,40,50},10);
		if(res!=1) {
			System.out.println("Element is found at index: "+res);
		}else {
			System.out.println("Element is not found");
		}

	}

}
