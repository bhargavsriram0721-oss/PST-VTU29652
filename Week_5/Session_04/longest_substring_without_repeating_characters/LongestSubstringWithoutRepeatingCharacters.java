// Week 5 | Session 4 | Longest Substring Without Repeating Characters
// Original practice problem: https://leetcode.com/problems/longest-substring-without-repeating-characters/
// Run: javac LongestSubstringWithoutRepeatingCharacters.java && java LongestSubstringWithoutRepeatingCharacters

import java.util.*;
public class LongestSubstringWithoutRepeatingCharacters {
    static int lengthOfLongestSubstring(String s) {
        Map<Character,Integer>m=new HashMap<>();
        int l=0,b=0;
        for(int r=0;r<s.length();r++) {
            char c=s.charAt(r);
            if(m.containsKey(c))l=Math.max(l,m.get(c)+1);
            m.put(c,r);
            b=Math.max(b,r-l+1);
        }
        return b;
    }
    public static void main(String[]x) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
