// Week 5 | Session 5 | String Matching in an Array
// Original practice problem: https://leetcode.com/problems/string-matching-in-an-array/
// Run: javac StringMatchingInAnArray.java && java StringMatchingInAnArray

import java.util.*;
public class StringMatchingInAnArray {
    static List<String> stringMatching(String[]w) {
        List<String>o=new ArrayList<>();
        for(int i=0;i<w.length;i++)for(int j=0;j<w.length;j++)if(i!=j&&w[j].contains(w[i])) {
            o.add(w[i]);
            break;
        }
        return o;
    }
    public static void main(String[]x) {
        System.out.println(stringMatching(new String[] {
            "mass","as","hero","superhero"
        }
        ));
    }
}
