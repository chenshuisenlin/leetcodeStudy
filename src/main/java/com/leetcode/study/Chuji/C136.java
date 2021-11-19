package com.leetcode.study.Chuji;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C136 {
    /**
     * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
     *
     * 说明：
     *
     * 你的算法应该具有线性时间复杂度O(n)。 你可以不使用额外空间来实现吗？
     *
     * 示例 1:
     *4
     * 3
     * 输入: [2,2,1]
     * 输出: 1
     * 示例 2:
     *7
     * 5
     * 输入: [4,1,2,1,2]
     * 输出: 4
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        int ans = nums[0];
        if (nums.length > 1) {
            for (int i = 1; i < nums.length; i++) {
                ans = ans ^ nums[i];
            }
        }
        return ans;

    }
}