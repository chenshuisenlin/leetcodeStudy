package com.leetcode.study.Jianzhi;

public class Jianzhi53 {
    /**
     * 
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
        //站到左边界
        //5,7,7,8,8,10
        int left=0;
        int right=nums.length-1;
        while (left<=right){
            int mid=(left+right)/2;
            if(nums[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        int j= left;
        if(right>=0&&nums[right]!=target){
            return 0;
        }
        left=0;
        right=nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        int i=right;


        return j-i-1;
    }
    public int search2(int[] nums, int target) {
        return helper(nums, target) - helper(nums, target - 1);
    }
    int helper(int[] nums, int tar) {
        int i = 0, j = nums.length - 1;
        while(i <= j) {
            int m = (i + j) / 2;
            if(nums[m] <= tar) i = m + 1;
            else j = m - 1;
        }
        return i;
    }


}
