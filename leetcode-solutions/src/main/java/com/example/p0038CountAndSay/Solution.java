package com.example.p0038CountAndSay;

public class Solution {
    public String countAndSay(int n) {
        var sb = new StringBuilder("1");

        for (int i = 0; i < n - 1; i++) {
            StringBuilder nextSb = new StringBuilder();

            int count = 1;
            char prev = sb.charAt(0);

            for (int j = 1; j < sb.length(); j++) {
                if (sb.charAt(j) == prev) {
                    count++;
                } else {
                    nextSb.append(count).append(prev);
                    prev = sb.charAt(j);
                    count = 1;
                }
            }

            nextSb.append(count).append(prev);
            sb = nextSb;
        }
        return sb.toString();
    }
}