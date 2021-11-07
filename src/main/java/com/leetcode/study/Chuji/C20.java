package com.leetcode.study.Chuji;

import java.util.HashMap;
import java.util.Stack;

public class C20 {
    /**
     * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
     *
     * 有效字符串需满足：
     *
     * 左括号必须用相同类型的右括号闭合。
     * 左括号必须以正确的顺序闭合。
     *  
     *
     * 示例 1：
     *
     * 输入：s = "()"
     * 输出：true
     * 示例 2：
     *
     * 输入：s = "()[]{}"
     * 输出：true
     * 示例 3：
     *
     * 输入：s = "(]"
     * 输出：false
     * 示例 4：
     *
     * 输入：s = "([)]"
     * 输出：false
     * 示例 5：
     *(){[]}
     * 输入：s = "{[]}"
     * 输出：true
     * @param s
     * @return
     */
    public boolean isValid(String s) {
        //StringBuffer sb=new StringBuffer();
        HashMap<Character,Character> map= new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        char[] arr=s.toCharArray();
        Stack<Character> stack=new Stack<>();
        for(char c:arr){
            if(map.containsKey(c)){
                stack.push(c);
            }else{
                if(map.get(stack.peek())==c){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        return stack.empty();
        /*for (int i = 0; i < arr.length; i++) {
            if(map.containsValue(arr[i])){

            }else{

            }
        }*/
    }

    public boolean isValid2(String s) {
        char[] arr=s.toCharArray();
        Stack<Character> after=new Stack<>();
        for(char c:arr){
            if(c=='('){
                after.push(')');
            }else if(c=='{'){
                after.push('}');
            }
            else if(c=='['){
                after.push(']');
            }else{
                if(!after.empty()&&c==after.peek()){
                    after.pop();
                }else{
                    return false;
                }
            }
        }
        return after.empty();
    }

}
