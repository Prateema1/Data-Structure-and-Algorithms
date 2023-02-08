package com.pratima;

public class SecondMaxInArray {
    public static void main(String[] args) {
        int[] arr = {2,3,12,13,33,34,55};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int ans = findSecondMax(arr, max, secondMax);
        System.out.println(ans);
    }

    public static int findSecondMax(int[] arr, int max, int secondMax) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
}
