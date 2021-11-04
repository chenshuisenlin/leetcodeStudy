package com.leetcode.study.Jianzhi;

public class Jianzhi05 {
    public static void main(String[] args) {
        System.out.println(replaceSpace("We are happy."));
    }
    public static String replaceSpace(String s) {

        char[] a=s.toCharArray();
        StringBuffer sb=new StringBuffer();
        for(char c:a){
            if(c==' '){
                sb.append("%20");
            }else{
                sb.append(String.valueOf(c));
            }
        }
        return sb.toString();
    }
}
