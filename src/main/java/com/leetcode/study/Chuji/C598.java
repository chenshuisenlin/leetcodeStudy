package com.leetcode.study.Chuji;

public class C598 {
    /**
     * 给定一个初始元素全部为 0，大小为 m*n 的矩阵 M 以及在 M 上的一系列更新操作。
     *
     * 操作用二维数组表示，其中的每个操作用一个含有两个正整数 a 和 b 的数组表示，含义是将所有符合 0 <= i < a 以及 0 <= j < b 的元素 M[i][j] 的值都增加 1。
     *
     * 在执行给定的一系列操作后，你需要返回矩阵中含有最大整数的元素个数。
     *
     * @param m
     * @param n
     * @param ops
     * @return
     */
    public int maxCount(int m, int n, int[][] ops) {
        if(ops.length==0){
            return m*n;
        }
        int minZ=Integer.MAX_VALUE;
        int minH=Integer.MAX_VALUE;
        for(int i=0;i<ops.length;i++){
            minZ=Math.min(minZ, ops[i][0]);
            minH=Math.min(minH, ops[i][1]);
        }

        return minH*minZ;
    }
}
