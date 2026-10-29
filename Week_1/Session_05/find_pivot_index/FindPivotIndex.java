// Week 1 | Session 5 | Find Pivot Index
// Original practice problem: https://leetcode.com/problems/find-pivot-index/
// Run: javac FindPivotIndex.java && java FindPivotIndex

public class FindPivotIndex {
    static int pivotIndex(int[] a) {
        int total=0,left=0;
        for(int x:a)total+=x;
        for(int i=0;i<a.length;i++) {
            if(left==total-left-a[i])return i;
            left+=a[i];
        }
        return -1;
    }
    public static void main(String[] z) {
        System.out.println(pivotIndex(new int[] {
            1,7,3,6,5,6
        }
        ));
    }
}
