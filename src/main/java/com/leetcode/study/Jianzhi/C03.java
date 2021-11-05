package com.leetcode.study.Jianzhi;

public class C03 {
    /**
     * 数组重复数字
     * 考虑O（1） 原地替换算法
     * @param nums
     * @return
     */
    public int findRepeatNumber(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            if(nums[i] == i) {
                i++;
                continue;
            }
            if(nums[nums[i]] == nums[i]) {
                return nums[i];
            }
            int tmp = nums[i];
            nums[i] = nums[tmp];
            nums[tmp] = tmp;
        }
        return -1;
    }

}
