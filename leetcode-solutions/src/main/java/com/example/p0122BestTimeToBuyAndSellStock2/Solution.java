package com.example.p0122BestTimeToBuyAndSellStock2;

public class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int profit = 0;

        for (int p : prices) {
            if (p > buyPrice)
                profit += p - buyPrice;
            buyPrice = p;
        }

        return profit;
    }
}