package com.leetcode.study.Chuji;

public class C121 {
    public static void main(String[] args) {
        C121 c121=new C121();
        int[] arr={6,7 ,8, 5 ,8 ,5 ,4 ,9, 2, 1, 4, 3};
        System.out.println(c121.maxProfit(arr));
    }
    public int maxProfit(int[] prices) {
        //6 7 8 5 8 5 4 9 2 1 4 3
        int max=0;
        if(prices.length<3){
            max=prices[0]<prices[1]?(prices[1]-prices[0]):0;
        }else{
            for(int i=0;i<prices.length-1;i++){
                int j=i+1;
                while(j<prices.length){
                    if(prices[i]<prices[j]){
                        max=Math.max(max, prices[j]-prices[i]);
                    }else{
                        break;
                    }
                    j++;
                }
            }
        }
        return max;
    }
}
