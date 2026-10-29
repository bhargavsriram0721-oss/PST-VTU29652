// Week 6 | Session 3 | Find All Anagrams in a String
// Original practice problem: https://leetcode.com/problems/find-all-anagrams-in-a-string/
// Run: javac FindAllAnagramsInAString.java && java FindAllAnagramsInAString

import java.util.*;
public class FindAllAnagramsInAString {
    static List<Integer> findAnagrams(String s,String p) {
        List<Integer>o=new ArrayList<>();
        if(p.length()>s.length())return o;
        int[]a=new int[26],b=new int[26];
        for(char c:p.toCharArray())a[c-'a']++;
        for(int i=0;i<s.length();i++) {
            b[s.charAt(i)-'a']++;
            if(i>=p.length())b[s.charAt(i-p.length())-'a']--;
            if(Arrays.equals(a,b))o.add(i-p.length()+1);
        }
        return o;
    }
    public static void main(String[]x) {
        System.out.println(findAnagrams("cbaebabacd","abc"));
    }
}
