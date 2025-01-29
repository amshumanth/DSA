package com.mru.faqs;

import java.util.HashMap;

public class Frequency {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,2,3,4,3,4,3,4,4};
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int element:arr) {
			map.put(element,map.getOrDefault(element,0)+1);
		}
		for(HashMap.Entry<Integer,Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" frequency is: "+entry.getValue());
		}

	}

}
