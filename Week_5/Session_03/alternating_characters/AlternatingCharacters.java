// Week 5 | Session 3 | Alternating Characters
// Original practice problem: https://www.hackerrank.com/challenges/alternating-characters/problem
// Run: javac AlternatingCharacters.java && java AlternatingCharacters

public class AlternatingCharacters {
    static int alternatingCharacters(String s) {
        int c=0;
        for(int i=1;i<s.length();i++)if(s.charAt(i)==s.charAt(i-1))c++;
        return c;
    }
    public static void main(String[]x) {
        System.out.println(alternatingCharacters("AABAAB"));
    }
}
