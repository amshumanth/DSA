package com.mru.faqs;

public class BinarySearch8 {
	
	public static int binary_search(int[] arr, int search_element) {
		int low = 0;
		int high = arr.length-1;
		while(low<=high) {
			int mid = low + (high-low)/2;
			if(arr[mid] == search_element) {
				return mid;
			}
			if(search_element > arr[mid]) {
				low = mid+1;
			}else {
				high = mid-1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60,70,80,90,100};
		int search_element = 100;
		System.out.println("Element is found at Index: "+binary_search(arr,search_element));
	}

}
