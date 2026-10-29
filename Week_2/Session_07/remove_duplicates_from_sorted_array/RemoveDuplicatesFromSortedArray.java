// Week 2 | Session 7 | Remove Duplicates from Sorted Array
// Original practice problem: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Run: javac RemoveDuplicatesFromSortedArray.java && java RemoveDuplicatesFromSortedArray

import java.util.*;
public class RemoveDuplicatesFromSortedArray {
    static int removeDuplicates(int[] a) {
        if(a.length==0)return 0;
        int k=1;
        for(int i=1;i<a.length;i++)if(a[i]!=a[k-1])a[k++]=a[i];
        return k;
    }
    public static void main(String[]x) {
        int[] a= {
            0,0,1,1,2
        }
        ;
        int k=removeDuplicates(a);
        System.out.println(Arrays.toString(Arrays.copyOf(a,k)));
    }
}
