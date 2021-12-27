package com.leetcode.study.Jianzhi;

public class jianzhi53_2 {
    public static void main(String[] args) {
        int[] nums={0,1,2,3,4,5,6,7,9};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        int left=0;
        int right=nums.length-1;
        while (right>left){
            int i=(left+right)/2;
            if(nums[i]==i){
                left=i+1;
            }else {
                right=i-1;
            }
        }
        System.out.println("left="+left+"   right="+right);
        return nums[left]==left?left+1:left;
        /*int left=0;
        int right=nums.length;
        int i=(left+right)/2;
        while (left+1!=right){
            if(nums[i]==i){
                left=i;
                i=(left+right)/2;
            }else{
                right=i;
                i=(left+right)/2;
            }
        }
        return (nums[left]+nums[right])/2;*/
    }

}
