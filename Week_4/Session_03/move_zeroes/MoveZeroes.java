// Week 4 | Session 3 | Move Zeroes
// Original practice problem: https://leetcode.com/problems/move-zeroes/
// Run: javac MoveZeroes.java && java MoveZeroes

import java.util.*;
public class MoveZeroes {
    static void moveZeroes(int[] a) {
        int k=0;
        for(int x:a)if(x!=0)a[k++]=x;
        while(k<a.length)a[k++]=0;
    }
    public static void main(String[]x) {
        int[]a= {
            0,1,0,3,12
        }
        ;
        moveZeroes(a);
        System.out.println(Arrays.toString(a));
    }
}
