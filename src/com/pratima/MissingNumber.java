package com.pratima;

//Find missing number in range 1 to N, given missing number exists and Time Complexity should be O(N)
//Using mathematical approach as range is from 1 to N
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,5,4,6};
        int n = arr.length + 1;     // To find sum of n natural numbers, add the missing number to the length of array
        int missingNumber = findMissingNumber(arr, n);
        System.out.println(missingNumber);
    }

    public static int findMissingNumber(int[] arr, int n) {
        int sum = n * (n + 1) / 2;
        for(int element : arr) {
            sum = sum - element;
        }
        return  sum;
    }
}
