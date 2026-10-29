// Week 6 | Session 2 | Two Strings
// Original practice problem: https://www.hackerrank.com/challenges/two-strings/
// Run: javac TwoStrings.java && java TwoStrings

public class TwoStrings {
    static String twoStrings(String a,String b) {
        boolean[]seen=new boolean[256];
        for(char c:a.toCharArray())seen[c]=true;
        for(char c:b.toCharArray())if(seen[c])return "YES";
        return "NO";
    }
    public static void main(String[]x) {
        System.out.println(twoStrings("hello","world"));
    }
}
