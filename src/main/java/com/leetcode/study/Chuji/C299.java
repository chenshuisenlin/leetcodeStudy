package com.leetcode.study.Chuji;

import java.util.*;

public class C299 {
    public static void main(String[] args) {
        System.out.println(getHint("1123","0111"));
    }
    /**
     * 你在和朋友一起玩 猜数字（Bulls and Cows）游戏，该游戏规则如下：
     *
     * 写出一个秘密数字，并请朋友猜这个数字是多少。朋友每猜测一次，你就会给他一个包含下述信息的提示：
     *
     * 猜测数字中有多少位属于数字和确切位置都猜对了（称为 "Bulls", 公牛），
     * 有多少位属于数字猜对了但是位置不对（称为 "Cows", 奶牛）。也就是说，这次猜测中有多少位非公牛数字可以通过重新排列转换成公牛数字。
     * 给你一个秘密数字 secret 和朋友猜测的数字 guess ，请你返回对朋友这次猜测的提示。
     *
     * 提示的格式为 "xAyB" ，x 是公牛个数， y 是奶牛个数，A 表示公牛，B 表示奶牛。
     *
     * 1123
     * 0111
     *
     * 11 01
     *
     * 23 11
     * 请注意秘密数字和朋友猜测的数字都可能含有重复数字。
     * @param secret
     * @param guess
     * @return
     */
    public static String getHint(String secret, String guess) {
        char[] sarr=secret.toCharArray();
        char[] garr=guess.toCharArray();
        int A=0,B=0;
        for(int i=0;i<garr.length;i++){
            if(sarr[i]==garr[i]){
                A++;
            }
        }
        paixu(sarr);
        paixu(garr);
        int i=0,j=0;
        while (i<sarr.length&&j<garr.length){
            if(sarr[i]>garr[j]){
                j++;
            }else if(sarr[i]==garr[j]){
                i++;
                j++;
                B++;
            }else{
                i++;
            }
        }
        B=B-A;
        return A+"A"+B+"B";
    }
    public static void paixu(char[] ch){
        for(int i=0;i<ch.length-1;i++){
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]>=ch[j]){
                    char temp=' ';
                    temp=ch[i];
                    ch[i]=ch[j];
                    ch[j]=temp;
                }
            }
        }
    }

    public String getHint2(String secret, String guess) {
        int n = secret.length();
        int a = 0, b = 0;
        int[] cnt1 = new int[10], cnt2 = new int[10];
        for (int i = 0; i < n; i++) {
            int c1 = secret.charAt(i) - '0', c2= guess.charAt(i) - '0';
            if (c1 == c2) {
                a++;
            } else {
                cnt1[c1]++;
                cnt2[c2]++;
            }
        }
        for (int i = 0; i < 10; i++){
            b += Math.min(cnt1[i], cnt2[i]);
        }
        return a + "A" + b + "B";
    }
    public String getHint3(String secret, String guess) {
        int a = 0, b = 0;

        int[] arr = new int[10];
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                a++;
            } else {
                // 小于0说明之前guess中出现过相同的字符
                if (arr[secret.charAt(i) - '0']++ < 0){
                    b++;
                }
                // 大于0说之前secret中出现过相同的字符
                if (arr[guess.charAt(i) - '0']-- > 0){
                    b++;
                }
            }
        }

        // 构造返回值
        return new StringBuilder().append(a).append('A').append(b).append('B').toString();
    }


}
