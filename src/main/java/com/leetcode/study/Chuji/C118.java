package com.leetcode.study.Chuji;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C118 {
    public static void main(String[] args) {
        C118 c118 = new C118();
        List<List<Integer>> res=c118.generate(5);
        for(List<Integer> list:res){
            System.out.println(Arrays.toString(list.toArray()));
        }
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        list.add(0, 1);
        return addList(list,res,numRows);
    }
    public List<List<Integer>>  addList(List<Integer> list,List<List<Integer>> res,int numRows){
        List<Integer> nlist=new ArrayList<>();
        res.add(list.size()-1,list);

        if(list.size()<2){
            nlist.add(0,1);
            nlist.add(1,1);
        }else {
            for (int i = 0; i < list.size(); i++) {
                if(i==0){
                    nlist.add(i,1);
                }else{
                    nlist.add(i,list.get(i-1) + list.get(i));
                }
            }
            nlist.add(list.size(),1);
        }

        if(res.size()<numRows){
            return addList(nlist,res,numRows);
        }else{
            return res;
        }



    }
}
