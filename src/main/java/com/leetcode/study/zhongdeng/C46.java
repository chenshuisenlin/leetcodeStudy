package com.leetcode.study.zhongdeng;

import java.util.ArrayList;
import java.util.List;

public class C46 {
    /**
     * 给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。
     *
     *  
     *
     * 示例 1：
     *
     * 输入：nums = [1,2,3]
     * 输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
     * 示例 2：
     *
     * 输入：nums = [0,1]
     * 输出：[[0,1],[1,0]]
     * 示例 3：
     *
     * 输入：nums = [1]
     * 输出：[[1]]
     * @param nums
     * @return
     */
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res =new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(res.isEmpty()){
                List<Integer> list=new ArrayList<>();
                list.add(nums[i]);
                res.add(list);
            }else{
                for (int j = 0; j < res.size(); j++) {

                }
            }

        }
        return res;
    }


}
