// Week 2 | Session 6 | Build Array from Permutation
// Original practice problem: https://leetcode.com/problems/build-array-from-permutation/
// Run: javac BuildArrayFromPermutation.java && java BuildArrayFromPermutation

import java.util.*;
public class BuildArrayFromPermutation {
    static int[] buildArray(int[] a) {
        int[] b=new int[a.length];
        for(int i=0;i<a.length;i++)b[i]=a[a[i]];
        return b;
    }
    public static void main(String[]x) {
        System.out.println(Arrays.toString(buildArray(new int[] {
            0,2,1,5,3,4
        }
        )));
    }
}
