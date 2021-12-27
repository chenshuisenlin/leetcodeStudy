package com.leetcode.study.zhongdeng;

public class C33 {
    /**
     * 整数数组 nums 按升序排列，数组中的值 互不相同 。
     *
     * 在传递给函数之前，nums 在预先未知的某个下标 k（0 <= k < nums.length）上进行了 旋转，使数组变为 [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]（下标 从 0 开始 计数）。例如， [0,1,2,4,5,6,7] 在下标 3 处经旋转后可能变为 [4,5,6,7,0,1,2] 。
     *
     * 给你 旋转后 的数组 nums 和一个整数 target ，如果 nums 中存在这个目标值 target ，则返回它的下标，否则返回 -1 。
     *
     *  
     *
     * 示例 1：
     *
     * 输入：nums = [4,5,6,7,0,1,2], target = 0
     * 输出：4
     * 示例 2：
     *
     * 输入：nums = [4,5,6,7,0,1,2], target = 3
     * 输出：-1
     * 示例 3：
     *
     * 输入：nums = [1], target = 0
     * 输出：-1
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
        if(nums.length==1&&nums[0]!=target){
            return -1;
        }
        if(nums.length==1&&nums[0]==target){
            return 0;
        }
        int left=0,right=nums.length-1;
        if(nums[0]>target&&nums[right]<target){
            return -1;
        }
        // nums[left]<target nums[right]<target    可能发生了旋转在左侧 可能不存在右节点比左节点大
        // nums[left]>target nums[right]>target   发生了旋转 并且在旋转后的右侧 或者不存在
        // nums[left]<target nums[right]>target  left<target<right
        // nums[left]>target nums[right]<target  不存在

        while (left<right){
            if(nums[left]==target){
                return left;
            }
            if(nums[right]==target){
                return right;
            }
            if(nums[left]>target&&nums[right]<target){
                return -1;
            }else{
                left++;
                if(left!=right-1){
                    right--;
                }
            }/* if(nums[left]<target&&nums[right]>target){
                left++;
                if(left!=right-1){
                    right--;
                }
            }else if(nums[left]<target&&nums[right]<target){
                left++;
                if(left!=right-1){
                    right--;
                }
            }else if(nums[left]>target&&nums[right]>target){
                left++;
                if(left!=right-1){
                    right--;
                }
            }*/
        }
        return -1;
    }
}
