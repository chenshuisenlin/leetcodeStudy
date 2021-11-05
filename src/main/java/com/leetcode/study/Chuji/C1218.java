package com.leetcode.study.Chuji;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class C1218 {
    //最长定差子序列

    /**
     * 5 7  9 3 5 7
     * @param args
     */
    public static void main(String[] args) {
        int[] arr={231,-65,85,145,110,-210,-61,-38,-13,234,154,151,-114,65,-38,186,121,216,-33,-103,266,-157,-81,-235,-232,117,196,83,-155,33,184,166,-228,253,-287,229,-105,206,-294,-42,-232,-278,214,-105,142,23,-98,37,291,-77,-214,-138,268,-157,18,-250,58,-125,-112,-70,-255,33,215,-122,-109,157,-71,131,38,-82,-149,253,-245,137,59,-45,146,107,-232,-271,13,8,-87,102,-147,132,191,-182,-4,262,38,36,79,207,-269,-276,95,-80,-42,-150,271,206,96,291,90,-29,-132,39,265,-221,-268,1,-241,74,119,-114,61,108,74,117,-248,-203,-300,243,244,-63,252,52,85,183,-220,-117,-73,-11,-81,-194,230,-153,120,84,97,79,121,-209,79,-57,-238,273,67,-63,167,-42,-296,-179,139,161,292,13,-292,50,-173,90,280,118,42,54,33,-35,31,-173,168,56,56,-170,-104,158,25,162,-182,-208,171,-42,49,57,-49,-76,-249,264,140,206,253,-126,-60,-282,-97,-52,39,26,108,58,298,286,-277,128,-238,195,-202,58,284,-81,55,1,-23,166,205,-63,-141,-262,-297,35,58,196,237,204,-31,265,-162,68,-38,-265,-247,-161,11,232,31,-234,-15,31,-228,217,49,129,183,119,-214,-145,249,120,-100,152,68,-200,-32,273,-22,-141,122,-213,84,152,241,-294,40,84,299,-163,-241,239,213,-76,-283,-284,-31,-257,-141,-171,-208,-193,-268,-273,156,-263,-167,-277,-68,-146,-102,-240,-63,-222,40,-103,57,157,-169,225,212,-188,260,158};
        C1218 c1218 = new C1218();
        System.out.println(c1218.longestSubsequence(arr,-247));
    }
    public  int longestSubsequence(int[] arr, int difference) {
        int ans = 0;
        Map<Integer, Integer> dp = new HashMap<Integer, Integer>();
        for (int v : arr) {
            dp.put(v, dp.getOrDefault(v - difference, 0) + 1);
            ans = Math.max(ans, dp.get(v));
        }
        return ans;
        /*HashMap<Integer,Node> map=new HashMap<>();
        int max=1;
        if(difference!=0){
            for(int i=0;i<arr.length;i++){
                if(!map.containsKey(arr[i])||(map.containsKey(arr[i])&&map.get(arr[i]).next!=null)){
                    Node node=new Node(arr[i],1);
                    map.put(arr[i],node);
                }
                if(map.containsKey(arr[i]-difference)&&map.get(arr[i]-difference).next==null){
                    map.get(arr[i]-difference).next=map.get(arr[i]);
                    map.get(arr[i]).length=map.get(arr[i]-difference).length+1;
                    max=Math.max(max,map.get(arr[i]).length);
                    System.out.println("以"+(arr[i]-difference)+"结尾的数组长度为"+map.get(arr[i]-difference).length);
                    System.out.println("以"+arr[i]+"结尾的数组长度为"+max);
                    System.out.println("--------------");
                }
            }
        }else{
            for(int i=0;i<arr.length;i++){
                if(!map.containsKey(arr[i])){
                    Node node=new Node(arr[i],1);
                    map.put(arr[i],node);
                }else{
                    map.get(arr[i]).length=map.get(arr[i]).length+1;
                }
                max=Math.max(max,map.get(arr[i]).length);
            }
        }




        return max;*/
    }
    class Node {
        int val;
        Node next;
        int length;

        public Node(int val,int length) {
            this.val = val;
            this.next = null;
            this.length= length;
        }
    }
}
