package com.leetcode.study.Chuji;

public class C231 {
    /**
     * 想到了 n的二进程只有一个1  没想到更深层 n只有最高位是1 其余为0 n-1的同最高位是0 其余为0
     * @param n
     * @return
     */
    public boolean isPowerOfTwo(int n) {
        return n>0&&(n&(n-1))==0;
    }
}
