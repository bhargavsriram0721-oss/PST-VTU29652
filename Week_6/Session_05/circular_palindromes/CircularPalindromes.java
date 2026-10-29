// Week 6 | Session 5 | Circular Palindromes
// Original practice problem: https://www.hackerrank.com/challenges/circular-palindromes/
// Run: javac CircularPalindromes.java && java CircularPalindromes

import java.util.*;
// Starter implementation for the circular-palindrome challenge.
// For each rotation, this straightforward O(n^2) method finds the longest palindromic substring.
public class CircularPalindromes {
    static int longest(String s) {
        int best=0;
        for(int i=0;i<s.length();i++)for(int j=i;j<s.length();j++) {
            int l=i,r=j;
            while(l<r&&s.charAt(l)==s.charAt(r)) {
                l++;
                r--;
            }
            if(l>=r)best=Math.max(best,j-i+1);
        }
        return best;
    }
    static int[] circularPalindromes(String s) {
        int n=s.length();
        int[]out=new int[n];
        for(int i=0;i<n;i++)out[i]=longest(s.substring(i)+s.substring(0,i));
        return out;
    }
    public static void main(String[]x) {
        System.out.println(Arrays.toString(circularPalindromes("aba")));
    }
}
