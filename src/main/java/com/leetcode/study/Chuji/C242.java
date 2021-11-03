package com.leetcode.study.Chuji;

public class C242 {
    public static void main(String[] args) {
        String a="abc";
        String b="abc";
        System.out.println(a.equals(b));
    }
    public boolean isAnagram(String s, String t) {
        if(s.equals(t)){
            if(s.length()==1){
                return true;
            }
            return false;
        }else{
            if(s.length()!=t.length()){
                return false;
            }
            int[] charCountRN = new int[26];
            int[] charCountM = new int[26];
            char[] charArrayRN = s.toCharArray();
            char[] charArrayM = t.toCharArray();

            for (char c : charArrayRN) {
                charCountRN[c-'a']++;
            }

            for (char c : charArrayM) {
                charCountM[c-'a']++;
            }

            for (int i = 0; i < 26; i++) {
                if(charCountRN[i] > charCountM[i]){
                    return false;
                }
            }
            return true;
        }
    }
}
