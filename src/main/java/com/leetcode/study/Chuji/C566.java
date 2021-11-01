package com.leetcode.study.Chuji;

import java.util.Arrays;

public class C566 {
    public static void main(String[] args) {
        C566 c566 = new C566();
        int[][] mat={{1},{2},{3},{4}};
        System.out.println(Arrays.toString(c566.matrixReshape(mat,2,2)));
    }
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        System.out.println("m="+m);
        int n=mat[0].length;
        System.out.println("n="+n);
        if(r*c!=m*n){
            return mat;
        }
        int[] arr=new int[r*c];
        int[][] res=new int[r][c];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int nums=j+i*n;
                System.out.println("nums="+nums);
                int k=nums/c;
                System.out.println("k="+k);
                int v=nums-c*k;
                System.out.println("v="+v);
                res[k][v]=mat[i][j];
            }
        }
        return res;
    }
}
