package com.leetcode.study.Chuji;

import java.util.*;
import java.util.stream.Collectors;

public class C36 {
    public static void main(String[] args) {
        C36 c36 = new C36();
        /*char[] c={'5','3','3','.','7','.','.','.','.'};
        System.out.println(c36.isValid(c));*/
        char c='2';
        System.out.println(c-'0');
    }
    public boolean isValidSudoku(char[][] board) {
        char[] c=new char[9];
        boolean res=true;

        for(char[] heng:board){
            if(!isValid(heng)){
                res=false;
                break;
            }
        }
        if(res){
            for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                    c[j]=board[j][i];
                }
                if(!isValid(c)){
                    res=false;
                    break;
                }
            }
        }
        if(res){
            for(int i=0;i<8;i=i+3){
                for(int j=0;j<8;j=j+3){
                    c[0]=board[i][j];
                    c[1]=board[i][j+1];
                    c[2]=board[i][j+2];
                    c[3]=board[i+1][j];
                    c[4]=board[i+1][j+1];
                    c[5]=board[i+1][j+2];
                    c[6]=board[i+2][j];
                    c[7]=board[i+2][j+1];
                    c[0]=board[i+2][j+2];
                    if(!isValid(c)){
                        res=false;
                        break;
                    }
                }
                if(!res){
                    break;
                }
            }
        }





        return res;
    }
    public boolean isValid(char[] line){
        Set<Character>  set=new HashSet<>();
        boolean b=true;
        for(char c:line){
            if(!set.contains(c)){
                set.add(c);
            }else {
                if(!Character.valueOf('.').equals(c)){
                    b=false;
                }
            }
        }
        return b;
    }

    public boolean isValidSudoku2(char[][] board) {
        boolean[][] row = new boolean[10][10], col = new boolean[10][10], area = new boolean[10][10];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int c = board[i][j];
                if (c == '.') continue;
                int u = c - '0';
                int idx = i / 3 * 3 + j / 3;
                if (row[i][u] || col[j][u] || area[idx][u]) return false;
                row[i][u] = col[j][u] = area[idx][u] = true;
            }
        }
        return true;
    }

}
