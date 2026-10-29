// Week 4 | Session 1 | Determine if String Halves Are Alike
// Original practice problem: https://leetcode.com/problems/determine-if-string-halves-are-alike/
// Run: javac DetermineIfStringHalvesAreAlike.java && java DetermineIfStringHalvesAreAlike

public class DetermineIfStringHalvesAreAlike {
    static boolean halvesAreAlike(String s) {
        int n=s.length(),c=0;
        for(int i=0;i<n/2;i++) {
            if("aeiouAEIOU".indexOf(s.charAt(i))>=0)c++;
            if("aeiouAEIOU".indexOf(s.charAt(i+n/2))>=0)c--;
        }
        return c==0;
    }
    public static void main(String[]x) {
        System.out.println(halvesAreAlike("book"));
    }
}
