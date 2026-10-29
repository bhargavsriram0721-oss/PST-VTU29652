// Week 1 | Session 5 | Squares of a Sorted Array
// Original practice problem: https://leetcode.com/problems/squares-of-a-sorted-array/
// Run: javac SquaresOfASortedArray.java && java SquaresOfASortedArray

import java.util.*;
public class SquaresOfASortedArray {
    static int[] sortedSquares(int[] a) {
        int n=a.length,l=0,r=n-1;
        int[] out=new int[n];
        for(int i=n-1;i>=0;i--) {
            int x=Math.abs(a[l])>Math.abs(a[r])?a[l++]:a[r--];
            out[i]=x*x;
        }
        return out;
    }
    public static void main(String[] z) {
        System.out.println(Arrays.toString(sortedSquares(new int[] {
            -4,-1,0,3,10
        }
        )));
    }
}
