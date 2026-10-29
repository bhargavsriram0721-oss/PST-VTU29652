// Week 2 | Session 9 | Group Anagrams
// Original practice problem: https://leetcode.com/problems/group-anagrams/
// Run: javac GroupAnagrams.java && java GroupAnagrams

import java.util.*;
public class GroupAnagrams {
    static List<List<String>> groupAnagrams(String[] a) {
        Map<String,List<String>> m=new HashMap<>();
        for(String s:a) {
            char[] c=s.toCharArray();
            Arrays.sort(c);
            m.computeIfAbsent(new String(c),k->new ArrayList<>()).add(s);
        }
        return new ArrayList<>(m.values());
    }
    public static void main(String[]x) {
        System.out.println(groupAnagrams(new String[] {
            "eat","tea","tan","ate","nat","bat"
        }
        ));
    }
}
