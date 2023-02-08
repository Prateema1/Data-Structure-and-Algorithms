package com.pratima;

import java.util.Arrays;

//Remove Even Integers From Array and Return New Array containing Odd Integer values
public class OddIntegerArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,8};
        int[] ans = removeEven(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] removeEven(int[] arr) {
        int oddCount = 0;
        for(int element : arr) {
             if(element % 2 != 0) {
                 oddCount++;
             }
        }

        int[] result = new int[oddCount];
        int index = 0;

        for(int element : arr) {
            if(element % 2 != 0) {
                result[index] = element;
                index++;
            }
        }
        return result;
    }
}
