// Week 1 | Session 4 | Running Sum of 1D Array
// Original practice problem: https://leetcode.com/problems/running-sum-of-1d-array/
// Run: javac RunningSumOf1DArray.java && java RunningSumOf1DArray

import java.util.*;
public class RunningSumOf1DArray {
    static int[] runningSum(int[] a) {
        for(int i=1;i<a.length;i++)a[i]+=a[i-1];
        return a;
    }
    public static void main(String[] z) {
        System.out.println(Arrays.toString(runningSum(new int[] {
            1,2,3,4
        }
        )));
    }
}
