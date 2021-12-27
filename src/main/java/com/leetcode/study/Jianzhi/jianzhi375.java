package com.leetcode.study.Jianzhi;

public class jianzhi375 {
    public static void main(String[] args) {
        System.out.println(getMoneyAmount(10,7));
    }
    public static int getMoneyAmount(int n,int flag) {
        int left=flag;
        int right=n;
        int lmax=0;
        int rmax=0;
        while(left<right){
            int k=(left+right)/2;
            if(left!=k){
                rmax=rmax+k;
                left=k+1;
            }else{
                break;
            }
            System.out.println("rmax="+rmax);
        }
        left=1;

        return Math.max(lmax,n);
    }
    /*public static int sumT(int left,int right,int sums){
        int k=(left+1+right)/2;
        if(left>=right){
            return sums;
        }

    }*/
}
