package com.mru.faqs;

public class ReverseArray {
    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }


	public static void main(String[] args) {
	       int[] arr = {101, 201, 301, 401, 501};

	        // Loop through the array and reverse each element
	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = reverseNumber(arr[i]);
	        }

	        // Output the reversed array
	        System.out.print("Reversed array: [");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i]);
	            if (i < arr.length - 1) {
	                System.out.print(", ");
	            }
	        }
	        System.out.println("]");

		
	}

}
