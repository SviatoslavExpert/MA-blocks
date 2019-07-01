package com.granovskiy;

public class Demo {
    public static void main(String[] args) {
        int[] array = {3, 5, 1, 9, 10};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(max);
        // O(1) - constant
        // O(n) - linear complexity of Algorithm
        // O(logn) - logarithmic complexity - binary search
        // O(nlogn) - merge sort (n going through an array when merging; logn - sorting)
        // O(n^2) - considered to bad complexity of algorithms

        int arr[] = {1, 3, 4, 5, 6, 8};
        int result = doBinarySearch(arr, 3);
        System.out.println(result);
    }

    private static int doBinarySearch(int[] arr, int target) {
        int low = 0;
        int mid = 0;
        int hi = arr.length - 1;
        while (low <= hi) {
            mid = (low + hi) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                hi = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return mid;
    }
}
