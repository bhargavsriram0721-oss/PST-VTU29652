// Week 3 | Session 14 | Largest Number
// Original practice problem: https://leetcode.com/problems/largest-number/
// Run: javac LargestNumber.java && java LargestNumber

import java.util.*;
public class LargestNumber {
    static String largestNumber(int[] a) {
        String[] s=Arrays.stream(a).mapToObj(String::valueOf).toArray(String[]::new);
        Arrays.sort(s,(u,v)->(v+u).compareTo(u+v));
        if(s[0].equals("0"))return "0";
        return String.join("",s);
    }
    public static void main(String[]x) {
        System.out.println(largestNumber(new int[] {
            3,30,34,5,9
        }
        ));
    }
}
