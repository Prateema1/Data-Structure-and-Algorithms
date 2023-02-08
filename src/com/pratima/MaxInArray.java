package com.pratima;

public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = {3, 4, 23, 44, 55, 32};
        int max = arr[0];                     //Suppose max is first element in our array
        int ans = findMaxInArray(arr, max);
        System.out.println(ans);
    }

    public static int findMaxInArray(int[] arr, int max) {
        for(int i = 1; i < arr.length; i++) {
            if(max <= arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
