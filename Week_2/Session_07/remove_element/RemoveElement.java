// Week 2 | Session 7 | Remove Element
// Original practice problem: https://leetcode.com/problems/remove-element/
// Run: javac RemoveElement.java && java RemoveElement

import java.util.*;
public class RemoveElement {
    static int removeElement(int[] a,int val) {
        int k=0;
        for(int x:a)if(x!=val)a[k++]=x;
        return k;
    }
    public static void main(String[]x) {
        int[] a= {
            3,2,2,3
        }
        ;
        int k=removeElement(a,3);
        System.out.println("k="+k+" "+Arrays.toString(Arrays.copyOf(a,k)));
    }
}
