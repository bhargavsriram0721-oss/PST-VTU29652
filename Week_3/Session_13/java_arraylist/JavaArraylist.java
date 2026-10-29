// Week 3 | Session 13 | Java Arraylist
// Original practice problem: https://www.hackerrank.com/challenges/java-arraylist/problem
// Run: javac JavaArraylist.java && java JavaArraylist

import java.util.*;
public class JavaArraylist {
    public static void main(String[]x) {
        List<List<Integer>> a=Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(4,5));
        int row=2,col=1;
        System.out.println(col<a.get(row-1).size()?a.get(row-1).get(col):"ERROR!");
    }
}
