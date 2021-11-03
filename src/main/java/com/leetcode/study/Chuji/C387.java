package com.leetcode.study.Chuji;

import java.util.*;

public class C387 {
    public int firstUniqChar(String s) {
        char[] arr= s.toCharArray();
        HashMap<Character,Integer> map =new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],-1);
            }else{
                map.put(arr[i],i);
            }
        }
        int k=-1;
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])!=-1){
                return map.get(arr[i]);
            }
        }

        return k;
/*       char[] cs = s.toCharArray();
        char[] chars = new char[128];
        for(int i = 0 ; i < cs.length; i++){
            chars[cs[i]]++;
        }
        for(int i = 0; i < cs.length; i++){
            if(chars[cs[i]] == 1){
                return i;
            }
        }
        return -1;*/
    }

}
