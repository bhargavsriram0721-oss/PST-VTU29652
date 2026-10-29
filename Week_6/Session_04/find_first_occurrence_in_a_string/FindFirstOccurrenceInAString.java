// Week 6 | Session 4 | Find First Occurrence in a String
// Original practice problem: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
// Run: javac FindFirstOccurrenceInAString.java && java FindFirstOccurrenceInAString

public class FindFirstOccurrenceInAString {
    static int strStr(String haystack,String needle) {
        return haystack.indexOf(needle);
    }
    public static void main(String[]x) {
        System.out.println(strStr("sadbutsad","sad"));
    }
}
