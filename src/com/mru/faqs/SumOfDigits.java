package com.mru.faqs;

public class SumOfDigits {

    public static void main(String[] args) {
        // Example array
        int[] arr = {12, 34, 56, 78};

        // Loop through the array
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int sumOfDigits = 0;

            // Calculate sum of digits for the current number
            while (num > 0) {
                sumOfDigits += num % 10; // Add the last digit
                num /= 10; // Remove the last digit
            }

            // Output the sum of digits for each element
            System.out.println("Sum of digits in " + arr[i] + " is: " + sumOfDigits);
        }
    }
}
	