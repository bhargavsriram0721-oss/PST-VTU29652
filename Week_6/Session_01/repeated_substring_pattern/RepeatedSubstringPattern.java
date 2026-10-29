// Week 6 | Session 1 | Repeated Substring Pattern
// Original practice problem: https://leetcode.com/problems/repeated-substring-pattern/
// Run: javac RepeatedSubstringPattern.java && java RepeatedSubstringPattern

public class RepeatedSubstringPattern {
    static boolean repeatedSubstringPattern(String s) {
        String d=s+s;
        return d.substring(1,d.length()-1).contains(s);
    }
    public static void main(String[]x) {
        System.out.println(repeatedSubstringPattern("abab"));
    }
}
