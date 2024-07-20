package com.example.p0009PalindromeNumber;

public class Solution {
    public boolean isPalindrome(int n) {
        char[] cs = Integer.toString(n).toCharArray();

        for (int i = 0; i < (cs.length + 1) / 2; i++)
            if (cs[i] != cs[cs.length - i - 1])
                return false;

        return true;
    }
}