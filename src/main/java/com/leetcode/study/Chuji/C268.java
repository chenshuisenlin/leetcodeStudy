package com.leetcode.study.Chuji;

public class C268 {
    /**
     * 给定一个包含 [0, n] 中 n 个数的数组 nums ，找出 [0, n] 这个范围内没有出现在数组中的那个数。
     *
     *  
     *n == nums.length
     * 1 <= n <= 104
     * 0 <= nums[i] <= n
     * nums 中的所有数字都 独一无二
     * 示例 1：
     *
     * 输入：nums = [3,0,1]
     * 输出：2
     * 解释：n = 3，因为有 3 个数字，所以所有的数字都在范围 [0,3] 内。2 是丢失的数字，因为它没有出现在 nums 中。
     * @param nums
     * @return
     */
    public int missingNumber(int[] nums) {
        int res=0;
        for(int c:nums){
            res=res+c;
        }
        int sum=(1+nums.length)*nums.length/2;
        return sum-res;
    }

    /**
     * 异或方法 思路学习一下
     * @param nums
     * @return
     */
    public int missingNumber2(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for (int i = 0; i <= n; i++) ans ^= i;
        for (int i : nums) ans ^= i;
        return ans;
    }

}
