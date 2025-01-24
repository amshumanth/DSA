package com.mru.faqs;

public class MultiplyDigits {

    public static void main(String[] args) {
        // Example array
        int[] arr = {11, 23, 34, 56};

        // Loop through the array
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int productOfDigits = 1;

            // Calculate the multiplication of digits for the current number
            while (num > 0) {
                productOfDigits *= num % 10; // Multiply the last digit
                num /= 10; // Remove the last digit
            }

            // Output the product of digits for each element
            System.out.println("Multiplication of digits in " + arr[i] + " is: " + productOfDigits);
        }
    }
}
