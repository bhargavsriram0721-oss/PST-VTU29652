// Week 1 | Session 2 | Sort Array By Parity
// Original practice problem: https://leetcode.com/problems/sort-array-by-parity/
// Run: javac SortArrayByParity.java && java SortArrayByParity

import java.util.*;
public class SortArrayByParity {
    static int[] sortArrayByParity(int[] a) {
        int l=0,r=a.length-1;
        while(l<r) {
            if(a[l]%2> a[r]%2) {
                int t=a[l];
                a[l]=a[r];
                a[r]=t;
            }
            if(a[l]%2==0)l++;
            if(a[r]%2==1)r--;
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArrayByParity(new int[] {
            3,1,2,4
        }
        )));
    }
}
