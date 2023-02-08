package com.pratima;

import java.util.Arrays;

public class MoveAllZeros {
    public static void main(String[] args) {
        int[] arr = {1,2,0,5,6,0,0};
        int j = 0;
        int[] ans = moveAllZeros(arr, j);
        System.out.print(Arrays.toString(ans));
    }

    public static int[] moveAllZeros(int[] arr, int j) {
          for(int i = 0; i < arr.length; i++) {
              if(arr[i] != 0 && arr[j] == 0) {
                  int temp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = temp;
              }

              if(arr[j] != 0) {
                  j++;
              }
          }

          return arr;
    }
}
