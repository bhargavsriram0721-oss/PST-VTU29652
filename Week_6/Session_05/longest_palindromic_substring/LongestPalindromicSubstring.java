// Week 6 | Session 5 | Longest Palindromic Substring
// Original practice problem: https://leetcode.com/problems/longest-palindromic-substring/
// Run: javac LongestPalindromicSubstring.java && java LongestPalindromicSubstring

public class LongestPalindromicSubstring {
    static String longestPalindrome(String s) {
        int start=0,end=0;
        for(int i=0;i<s.length();i++) {
            int a=expand(s,i,i),b=expand(s,i,i+1),len=Math.max(a,b);
            if(len>end-start) {
                start=i-(len-1)/2;
                end=i+len/2;
            }
        }
        return s.substring(start,end+1);
    }
    static int expand(String s,int l,int r) {
        while(l>=0&&r<s.length()&&s.charAt(l)==s.charAt(r)) {
            l--;
            r++;
        }
        return r-l-1;
    }
    public static void main(String[]x) {
        System.out.println(longestPalindrome("babad"));
    }
}
