// Week 6 | Session 4 | Palindrome Index
// Original practice problem: https://www.hackerrank.com/challenges/palindrome-index/problem
// Run: javac PalindromeIndex.java && java PalindromeIndex

public class PalindromeIndex {
    static int palindromeIndex(String s) {
        int l=0,r=s.length()-1;
        while(l<r) {
            if(s.charAt(l)!=s.charAt(r)) {
                if(pal(s,l+1,r))return l;
                if(pal(s,l,r-1))return r;
                return -1;
            }
            l++;
            r--;
        }
        return -1;
    }
    static boolean pal(String s,int l,int r) {
        while(l<r)if(s.charAt(l++)!=s.charAt(r--))return false;
        return true;
    }
    public static void main(String[]x) {
        System.out.println(palindromeIndex("aaab"));
    }
}
