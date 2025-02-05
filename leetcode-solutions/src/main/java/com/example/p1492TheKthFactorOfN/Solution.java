package com.example.p1492TheKthFactorOfN;

public class Solution {
    public int kthFactor(int n, int k) {
        int count = 0;

        for (int i = 1; i <= n; i++)
            if (n % i == 0 && ++count == k)
                return i;

        return -1;
    }
}