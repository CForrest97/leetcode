package com.example.p0006ZigzagConversion;

public class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1)
            return s;

        var sb = new StringBuilder();

        for (int i = 0; i < s.length(); i += 2 * (numRows - 1))
            sb.append(s.charAt(i));

        for (int i = 1; i < (numRows - 1); i++) {
            for (int j = 0; i + j < s.length(); j += 2 * (numRows - 1)) {
                int x = i + j;
                int y = x + 2 * ((numRows - 1) - i);

                sb.append(s.charAt(x));
                if (y < s.length())
                    sb.append(s.charAt(y));
            }
        }

        for (int i = numRows - 1; i < s.length(); i += 2 * (numRows - 1))
            sb.append(s.charAt(i));

        return sb.toString();
    }
}