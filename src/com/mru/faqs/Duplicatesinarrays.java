package com.mru.faqs;

import java.util.HashSet;

public class Duplicatesinarrays {

	public static void main(String[] args) {
		int arr[] = {1,2,3,1,2,3};
		HashSet<Integer> set = new HashSet<>();
		boolean flag = false;
		for(int element:arr) {
			if(set.contains(element)) {
				flag = true;
				break;
			}else {
				set.add(element);
			}
		}
		System.out.println(flag ? "Duplicates are available" : "Duplicates are not found");

	}

}
