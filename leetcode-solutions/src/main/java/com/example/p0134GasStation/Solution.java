package com.example.p0134GasStation;

public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int remaining = 0;
        int start = 0;

        for (int i = 0; i < gas.length; i++) {
            remaining += gas[i] - cost[i];
            if (remaining < 0) {
                start = i + 1;
                remaining = 0;
            }
        }

        for (int i = 0; i < start; i++) {
            remaining += gas[i] - cost[i];
            if (remaining < 0)
                return -1;
        }

        return start;
    }
}