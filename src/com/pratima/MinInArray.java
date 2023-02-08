package com.pratima;

public class MinInArray {
    public static void main(String[] args) {
        int[] arr = {3, 4, 23, 44, 55, 32};
        int min = arr[0];                     //Suppose min is first element in our array
        int ans = findMinInArray(arr, min);
        System.out.println(ans);
    }

    public static int findMinInArray(int[] arr, int min) {
        for(int i = 1; i < arr.length; i++) {
            if(min >= arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
