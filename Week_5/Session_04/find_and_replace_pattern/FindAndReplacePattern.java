// Week 5 | Session 4 | Find and Replace Pattern
// Original practice problem: https://leetcode.com/problems/find-and-replace-pattern/
// Run: javac FindAndReplacePattern.java && java FindAndReplacePattern

import java.util.*;
public class FindAndReplacePattern {
    static List<String> findAndReplacePattern(String[]w,String p) {
        List<String>o=new ArrayList<>();
        for(String s:w)if(match(s,p))o.add(s);
        return o;
    }
    static boolean match(String a,String b) {
        Map<Character,Character>m=new HashMap<>(),r=new HashMap<>();
        for(int i=0;i<a.length();i++) {
            char x=a.charAt(i),y=b.charAt(i);
            if(m.containsKey(x)&&m.get(x)!=y||r.containsKey(y)&&r.get(y)!=x)return false;
            m.put(x,y);
            r.put(y,x);
        }
        return true;
    }
    public static void main(String[]x) {
        System.out.println(findAndReplacePattern(new String[] {
            "abc","deq","mee","aqq","dkd","ccc"
        }
        ,"abb"));
    }
}
