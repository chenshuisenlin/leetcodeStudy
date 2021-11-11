package com.leetcode.study.Jianzhi;

public class jianzhi53_2 {
    public int missingNumber(int[] nums) {
        int left=0;
        int right=nums.length;
        int i=(left+right)/2;
        while (left<right){
            if(nums[i]==i){
                left=i;
                i=(left+right)/2;
            }else{
                right=i;
                i=(left+right)/2;
            }
        }
    }

}
