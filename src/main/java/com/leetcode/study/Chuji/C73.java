package com.leetcode.study.Chuji;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C73 {
    public static void main(String[] args) {
        int[][] matrix={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        C73 c73 = new C73();
        c73.setZeroes(matrix);
        for(int[] arr:matrix){
            System.out.println(Arrays.toString(arr));
        }
    }
    public void setZeroes(int[][] matrix) {
        /*int[] location = new int[matrix[0].length];
        int[] row =new int[matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    location[i]=j+1;
                }
            }
        }
        System.out.println("location="+Arrays.toString(location));
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(location[i]!=0||location[j]!=0){
                    matrix[i][j]=0;
                }
            }

        }*/
        /*boolean[] heng=new boolean[matrix[0].length];
        boolean[] zong=new boolean[matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    zong[i]=true;
                    heng[j]=true;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(zong[i]||heng[j]){
                    matrix[i][j]=0;
                }
            }
        }*/
        /*Set<Integer> heng= new HashSet<>();
        Set<Integer> zong= new HashSet<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    zong.add(i);
                    heng.add(j);
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(zong.contains(i)||heng.contains(j)){
                    matrix[i][j]=0;
                }
            }
        }*/
        int m = matrix.length, n = matrix[0].length;
        boolean flagCol0 = false;
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                flagCol0 = true;
            }
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = matrix[0][j] = 0;
                }
            }
        }
        for (int i = m - 1; i >= 0; i--) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
            if (flagCol0) {
                matrix[i][0] = 0;
            }
        }

    }
}
