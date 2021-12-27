package com.leetcode.study.zhongdeng;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C15Test {
    @Test
    public void c15test(){
        int[] nums={-1,2,1,-4};
        int target=1;
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
        System.out.println(sums);

        //return res;
    }
}
