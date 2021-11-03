package com.leetcode.study.Chuji;

public class C383 {


    public boolean canConstruct(String ransomNote, String magazine) {
        char[] arrm=magazine.toCharArray();
        int[] chars = new int[128];
        char[] arrm2=ransomNote.toCharArray();
        boolean flag=true;
        for(int i = 0 ; i < arrm.length; i++){
            chars[arrm[i]]++;
        }
        for(int i = 0 ; i < arrm2.length; i++){
            chars[arrm2[i]]--;
            if(chars[arrm2[i]]==-1){
                flag=false;
                break;
            }
        }
        return flag;

        /*// 新建小写字母频次统计数组，0-25 分别代表 a-z
        int[] charCountRN = new int[26];
        int[] charCountM = new int[26];
        // 将 String 转化成 char[] 可以加速程序，因为 String.charAt() 每次调用都会检查下标是否越界
        char[] charArrayRN = ransomNote.toCharArray();
        char[] charArrayM = magazine.toCharArray();
        // 统计救赎信的各个字母出现次数
        for (char c : charArrayRN) {
            charCountRN[c-'a']++;
        }
        // 统计杂志的各个字母出现次数
        for (char c : charArrayM) {
            charCountM[c-'a']++;
        }
        // 对每个字母的出现次数进行比较
        for (int i = 0; i < 26; i++) {
            if(charCountRN[i] > charCountM[i]){
                return false;
            }
        }
        return true;*/

    }
}
