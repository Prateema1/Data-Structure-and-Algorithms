package com.pratima;

public class PalindromeOrNot {
    public static void main(String[] args) {
        String word = "true";
        char[] charArray = word.toCharArray();
        int start = 0;
        int end = charArray.length - 1;
        boolean ans = palindromeOrNot(charArray, start, end);
        System.out.println(ans);
    }

    public static boolean palindromeOrNot(char[] charArray, int start, int end) {
        while(start < end) {
            if(charArray[start] != charArray[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
