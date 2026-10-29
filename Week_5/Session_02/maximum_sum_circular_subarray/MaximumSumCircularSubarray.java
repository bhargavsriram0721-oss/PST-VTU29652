// Week 5 | Session 2 | Maximum Sum Circular Subarray
// Original practice problem: https://leetcode.com/problems/maximum-sum-circular-subarray/
// Run: javac MaximumSumCircularSubarray.java && java MaximumSumCircularSubarray

public class MaximumSumCircularSubarray {
    static int maxSubarraySumCircular(int[]a) {
        int total=0,curMax=0,max=Integer.MIN_VALUE,curMin=0,min=Integer.MAX_VALUE;
        for(int x:a) {
            curMax=Math.max(curMax+x,x);
            max=Math.max(max,curMax);
            curMin=Math.min(curMin+x,x);
            min=Math.min(min,curMin);
            total+=x;
        }
        return max<0?max:Math.max(max,total-min);
    }
    public static void main(String[]x) {
        System.out.println(maxSubarraySumCircular(new int[] {
            1,-2,3,-2
        }
        ));
    }
}
