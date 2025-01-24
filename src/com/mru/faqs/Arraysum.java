package com.mru.faqs;

public class Arraysum {

	public static void main(String[] args) {
	     // Example array
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Variables to store the sum of even and odd numbers
        int evenSum = 0;
        int oddSum = 0;

        // Loop through the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenSum += arr[i];  // Add to even sum if the number is even
            } else {
                oddSum += arr[i];   // Add to odd sum if the number is odd
            }
        }

        // Output the sums
        System.out.println("The sum of even numbers is: " + evenSum);
        System.out.println("The sum of odd numbers is: " + oddSum);


	}

}
