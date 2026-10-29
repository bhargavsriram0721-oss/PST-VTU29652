// Week 4 | Session 2 | Contains Duplicate
// Original practice problem: https://leetcode.com/problems/contains-duplicate/
// Run: javac ContainsDuplicate.java && java ContainsDuplicate

import java.util.*;
public class ContainsDuplicate {
    static boolean containsDuplicate(int[] a) {
        Set<Integer>s=new HashSet<>();
        for(int x:a)if(!s.add(x))return true;
        return false;
    }
    public static void main(String[]x) {
        System.out.println(containsDuplicate(new int[] {
            1,2,3,1
        }
        ));
    }
}
