// Week 5 | Session 1 | Maximum Subarray
// Original practice problem: https://leetcode.com/problems/maximum-subarray/
// Run: javac MaximumSubarray.java && java MaximumSubarray

public class MaximumSubarray {
    static int maxSubArray(int[]a) {
        int c=a[0],b=a[0];
        for(int i=1;i<a.length;i++) {
            c=Math.max(a[i],c+a[i]);
            b=Math.max(b,c);
        }
        return b;
    }
    public static void main(String[]x) {
        System.out.println(maxSubArray(new int[] {
            -2,1,-3,4,-1,2,1,-5,4
        }
        ));
    }
}
