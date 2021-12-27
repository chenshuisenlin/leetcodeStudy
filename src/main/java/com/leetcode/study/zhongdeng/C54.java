package com.leetcode.study.zhongdeng;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C54 {
    public static void main(String[] args) {
        int[][] l={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer> res=spiralOrder(l);
        Iterator<Integer> iterator = res.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    /**
     * 给你一个 m 行 n 列的矩阵 matrix ，请按照 顺时针螺旋顺序 ，返回矩阵中的所有元素。
     *
     *  
     *
     * 示例 1：
     *
     *
     * 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
     * 输出：[1,2,3,6,9,8,7,4,5]
     * 示例 2：
     *
     *
     * 输入：matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
     * 输出：[1,2,3,4,8,12,11,10,9,5,6,7]
     *  
     *
     * @param matrix
     * @return
     */
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        boolean[][] flag=new boolean[m][n];
        int x=0,y=0;
        




        while(true){
            //因为是第一排 其实需要顺时针转 需要先判断往上有没有路径
            //往上探索 截止条件就是x==0 或者 flag[x-1][y]==true
            //往右探索 截止条件就是y==n-1 或者 flag[x][y+1]==true
            //往下探索 截止条件就是x==m-1 或者 flag[x+1][y]==true
            //往左探索 截止条件就是y==0 或者 flag[x][y-1]==true
            //四个方向都不满足了 截止循环
            if(!flag[x][y]){
                res.add(matrix[x][y]);
            }
            if(y!=n-1&&!flag[x][y+1]){
                flag[x][y]=true;
                y++;
            }else if(x!=m-1&&!flag[x+1][y]){
                flag[x][y]=true;
                x++;
            }else if(y!=0&&!flag[x][y-1]){
                flag[x][y]=true;
                y--;
            }else if(x!=0&&!flag[x-1][y]){
                flag[x][y]=true;
                x--;
            }


            while (y!=n-1&&!flag[x][y+1]){
                res.add(matrix[x][y]);
                flag[x][y]=true;
                y++;
            }
            while(x!=m-1&&!flag[x+1][y]){
                res.add(matrix[x][y]);
                flag[x][y]=true;
                x++;
            }
            while(y!=0&&!flag[x][y-1]){
                res.add(matrix[x][y]);
                flag[x][y]=true;
                y--;
            }
            while (x!=0&&!flag[x-1][y]){
                res.add(matrix[x][y]);
                flag[x][y]=true;
                x--;
            }
            if(flag[x-1][y]&&flag[x+1][y]&&flag[x][y-1]&&flag[x][y+1]){
                break;
            }
        }

        return res;
    }
}
