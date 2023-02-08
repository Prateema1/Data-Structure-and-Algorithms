package com.pratima;

import java.util.Arrays;

public class ResizeArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int capacity = arr.length * 2;
        int[] resizedArray = resizeArray(arr, capacity);
        System.out.print(Arrays.toString(resizedArray));
    }

    public static int[] resizeArray(int[] arr, int capacity) {
        int[] temp = new int[capacity];
        for(int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        return  temp;
    }
}
