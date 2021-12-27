package com.leetcode.study.Chuji;

public class C14 {
    public static void main(String[] args) {
        C14 c14 = new C14();
        String[] arr={"dog","racecar","car"};
        System.out.println(c14.longestCommonPrefix(arr));
    }
    /**
     * 编写一个函数来查找字符串数组中的最长公共前缀。
     *
     * 如果不存在公共前缀，返回空字符串 ""。
     *
     *  
     *
     * 示例 1：
     *
     * 输入：strs = ["flower","flow","flight"]
     * 输出："fl"
     * 示例 2：
     *
     * 输入：strs = ["dog","racecar","car"]
     * 输出：""
     * 解释：输入不存在公共前缀。
     * @param strs
     * @return
     */
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        String ans=strs[0];
        for(int j=1;j<strs.length;j++){
            int i=0;
            for(;i<ans.length()&&i<strs[j].length();i++){
                if(ans.charAt(i)!=strs[j].charAt(i)){
                    break;
                }
            }
            ans=ans.substring(0,i);
            if(ans.equals("")){
                return ans;
            }
        }
        return ans;
    }
}
