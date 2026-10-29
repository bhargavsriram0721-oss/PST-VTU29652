// Week 4 | Session 2 | Compare the Triplets
// Original practice problem: https://www.hackerrank.com/challenges/compare-the-triplets/problem
// Run: javac CompareTheTriplets.java && java CompareTheTriplets

import java.util.*;
public class CompareTheTriplets {
    static int[] compareTriplets(int[] a,int[] b) {
        int p=0,q=0;
        for(int i=0;i<3;i++) {
            if(a[i]>b[i])p++;
            else if(a[i]<b[i])q++;
        }
        return new int[] {
            p,q
        }
        ;
    }
    public static void main(String[]x) {
        System.out.println(Arrays.toString(compareTriplets(new int[] {
            5,6,7
        }
        ,new int[] {
            3,6,10
        }
        )));
    }
}
