package com.leetcode.study.Chuji;

import java.util.Arrays;

public class C26 {
    public static void main(String[] args) {
        C26 c26 = new C26();
        int[] arr={0,0,1,1,1,2,2,3,3,4};
        //c26.removeDuplicates(arr);
        //System.out.println(Arrays.toString(arr));
        System.out.println(c26.removeDuplicates(arr));
    }
    /**
     * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
     *
     * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
     *
     *  
     *
     * 说明:
     *
     * 为什么返回数值是整数，但输出的答案是数组呢?
     *
     * 请注意，输入数组是以「引用」方式传递的，这意味着在函数里修改输入数组对于调用者是可见的。
     *
     * 你可以想象内部操作如下:
     * 5
     *{0,0,1,1,1,2,2,3,3,4}
     * 0,1,1,1,2,2,3,3,4,4
     *
     *
     *
     *
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        if(nums.length==0||nums.length==1){
            return nums.length;
        }
        int target=0;
        for (int i = 1; i <nums.length ; i++) {
            if(nums[i]!=nums[target]){
                target++;
                nums[target]=nums[i];
            }
        }
       return target+1;
    }
}
