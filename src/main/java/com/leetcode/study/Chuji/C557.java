package com.leetcode.study.Chuji;

public class C557 {
    /**
     * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
     *
     *  
     *
     * 示例：
     *
     * 输入："Let's take LeetCode contest"
     * 输出："s'teL ekat edoCteeL tsetnoc"
     * @param s
     * @return
     */
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        StringBuffer ans = new StringBuffer();
        for(int i=0; i<str.length; i++){
            ans.append(" " + new StringBuffer(str[i]).reverse());
        }
        ans.delete(0,1);
        return ans.toString();

    }
    public String reverseWords2(String s) {
        StringBuffer ret = new StringBuffer();
        int length = s.length();
        int i = 0;
        while (i < length) {
            int start = i;
            while (i < length && s.charAt(i) != ' ') {
                i++;
            }
            for (int p = start; p < i; p++) {
                ret.append(s.charAt(start + i - 1 - p));
            }
            while (i < length && s.charAt(i) == ' ') {
                i++;
                ret.append(' ');
            }
        }
        return ret.toString();
    }

}
