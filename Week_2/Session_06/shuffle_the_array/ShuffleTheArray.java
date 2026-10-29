// Week 2 | Session 6 | Shuffle the Array
// Original practice problem: https://leetcode.com/problems/shuffle-the-array/
// Run: javac ShuffleTheArray.java && java ShuffleTheArray

import java.util.*;
public class ShuffleTheArray {
    static int[] shuffle(int[] a,int n) {
        int[] b=new int[2*n];
        for(int i=0;i<n;i++) {
            b[2*i]=a[i];
            b[2*i+1]=a[i+n];
        }
        return b;
    }
    public static void main(String[]x) {
        System.out.println(Arrays.toString(shuffle(new int[] {
            2,5,1,3,4,7
        }
        ,3)));
    }
}
