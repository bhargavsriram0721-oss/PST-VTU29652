// Week 5 | Session 2 | Maximum Subarray Sum
// Original practice problem: https://www.hackerrank.com/challenges/maxsubarray/
// Run: javac MaximumSubarraySum.java && java MaximumSubarraySum

import java.util.*;
public class MaximumSubarraySum {
    static int[] maxSubarray(int[]a) {
        int best=a[0],cur=a[0],non=0;
        boolean pos=false;
        for(int x:a) {
            if(x>0) {
                pos=true;
                non+=x;
            }
            cur=Math.max(x,cur+x);
            best=Math.max(best,cur);
        }
        return new int[] {
            best,pos?non:best
        }
        ;
    }
    public static void main(String[]x) {
        System.out.println(Arrays.toString(maxSubarray(new int[] {
            2,-1,2,3,4,-5
        }
        )));
    }
}
