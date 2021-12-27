package com.leetcode.study.zhongdeng;

public class C11 {
    public static void main(String[] args) {
        C11 c11 = new C11();
        int[] a={1,2,1};
        System.out.println(c11.maxArea(a));
    }
    /**
     * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0) 。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
     *
     * 说明：你不能倾斜容器。
     *
     * @param height
     * @return
     */
    public int maxArea(int[] height) {
        int max=0;
        int i=0,j=height.length-1;
        while (i<j){
            max=Math.max(max,(j-i)*Math.min(height[i],height[j]));
            if(height[i]>height[j]){
                j--;
            }else{
                i++;
            }
        }
        return max;
    }
}
