// Week 2 | Session 8 | Maximum Subarray
// Original practice problem: https://leetcode.com/problems/maximum-subarray/
// Run: javac MaximumSubarray.java && java MaximumSubarray

public class MaximumSubarray {
    static int maxSubArray(int[] a) {
        int cur=a[0],best=a[0];
        for(int i=1;i<a.length;i++) {
            cur=Math.max(a[i],cur+a[i]);
            best=Math.max(best,cur);
        }
        return best;
    }
    public static void main(String[]x) {
        System.out.println(maxSubArray(new int[] {
            -2,1,-3,4,-1,2,1,-5,4
        }
        ));
    }
}
