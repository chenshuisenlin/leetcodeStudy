package com.leetcode.study.Jianzhi;

import java.util.Arrays;

public class Jianzhi58 {
    public String reverseLeftWords(String s, int n) {
        /*StringBuilder res = new StringBuilder();
        for(int i = n; i < s.length(); i++)
            res.append(s.charAt(i));
        for(int i = 0; i < n; i++)
            res.append(s.charAt(i));
        return res.toString();*/

        return s.substring(n)+s.substring(0,n);
    }
}
