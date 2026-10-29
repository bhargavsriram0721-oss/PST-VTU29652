// Week 5 | Session 3 | String to Integer atoi
// Original practice problem: https://leetcode.com/problems/string-to-integer-atoi/
// Run: javac StringToIntegerAtoi.java && java StringToIntegerAtoi

public class StringToIntegerAtoi {
    static int myAtoi(String s) {
        int i=0,n=s.length();
        while(i<n&&s.charAt(i)==' ')i++;
        int sign=1;
        if(i<n&&(s.charAt(i)=='+'||s.charAt(i)=='-'))sign=s.charAt(i++)=='-'?-1:1;
        long v=0;
        while(i<n&&Character.isDigit(s.charAt(i))) {
            v=v*10+s.charAt(i++)-'0';
            if(sign*v>Integer.MAX_VALUE)return Integer.MAX_VALUE;
            if(sign*v<Integer.MIN_VALUE)return Integer.MIN_VALUE;
        }
        return (int)(sign*v);
    }
    public static void main(String[]x) {
        System.out.println(myAtoi("   -42"));
    }
}
