package com.pratima;

import java.util.Arrays;

public class ReverseArray {
    public static  void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int start = 0;
        int end = arr.length - 1;
        reverseArray(arr, start, end);
    }

    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.print(Arrays.toString(arr));
    }
}
