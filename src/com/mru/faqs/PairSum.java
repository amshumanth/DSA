package com.mru.faqs;

public class PairSum {

    public static void main(String[] args) {
        // Example array
        int[] arr = {1, 10, 2, 20, 3, 30, 4, 40};

        // Loop to calculate sum of pairs (first and last, second and second-to-last, etc.)
        for (int i = 0; i < arr.length / 2; i++) {
            int sum = arr[i] + arr[arr.length - 1 - i];
            System.out.println(arr[i] + " + " + arr[arr.length - 1 - i] + " = " + sum);
        }
    }
}

