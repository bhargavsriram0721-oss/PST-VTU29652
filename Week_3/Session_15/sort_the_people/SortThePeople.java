// Week 3 | Session 15 | Sort the People
// Original practice problem: https://leetcode.com/problems/sort-the-people/
// Run: javac SortThePeople.java && java SortThePeople

import java.util.*;
public class SortThePeople {
    static String[] sortPeople(String[] names,int[] heights) {
        Integer[] ix=new Integer[names.length];
        for(int i=0;i<ix.length;i++)ix[i]=i;
        Arrays.sort(ix,(a,b)->Integer.compare(heights[b],heights[a]));
        String[] out=new String[names.length];
        for(int i=0;i<ix.length;i++)out[i]=names[ix[i]];
        return out;
    }
    public static void main(String[]x) {
        System.out.println(Arrays.toString(sortPeople(new String[] {
            "Mary","John","Emma"
        }
        ,new int[] {
            180,165,170
        }
        )));
    }
}
