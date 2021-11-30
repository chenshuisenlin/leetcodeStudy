package com.leetcode.study.zhongdeng;

import java.util.Arrays;

public class C16 {
    /**
     * 给你一个长度为 n 的整数数组 nums 和 一个目标值 target。请你从 nums 中选出三个整数，使它们的和与 target 最接近。
     *
     * 返回这三个数的和。
     *
     * 假定每组输入只存在恰好一个解。
     *
     *  
     *
     * 示例 1：
     *
     * 输入：nums = [-1,2,1,-4], target = 1
     * 输出：2
     * 解释：与 target 最接近的和是 2 (-1 + 2 + 1 = 2) 。
     * 示例 2：
     *
     * 输入：nums = [0,0,0], target = 1
     * 输出：0
     *
     * @param nums
     * @param target
     * @return
     */
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sums=0;
        int min=Integer.MAX_VALUE;
        for(int k=0;k<nums.length-2;k++){
            if(min==0){
                break;
            }
            int i=k+1;
            int j=nums.length-1;
            while (i<j){
                int sum=nums[k]+nums[i]+nums[j];
                if(sum>target){
                    if(min>sum-target){
                        min=sum-target;
                        sums=sum;
                    }
                    j--;
                }else if(sum<target){
                    if(min>target-sum){
                        min=target-sum;
                        sums=sum;
                    }
                    i++;
                }else{
                    sums=target;
                    min=0;
                    break;
                }
            }
        }
        return sums;
    }
}
