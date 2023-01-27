package com.pratima;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,55,56,57,78};
        int target = -1;
        int start = 0;
        int end = arr.length -1;
        System.out.println(searchElementIndex(arr, target, start, end));
    }
    static int searchElementIndex(int[] arr, int target, int start, int  end) {
       if(start > end) {
           return -1;
       }
       int mid = start + (end - start) / 2;
       if(arr[mid] == target) {
           return mid;
       }

       if(arr[mid] > target) {
           return searchElementIndex(arr, target, start, mid -1);
       }
       return  searchElementIndex(arr, target, mid + 1, end);
    }
}
