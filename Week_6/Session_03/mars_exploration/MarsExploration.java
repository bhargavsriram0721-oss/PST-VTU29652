// Week 6 | Session 3 | Mars Exploration
// Original practice problem: https://www.hackerrank.com/challenges/mars-exploration/
// Run: javac MarsExploration.java && java MarsExploration

public class MarsExploration {
    static int marsExploration(String s) {
        int c=0;
        for(int i=0;i<s.length();i++)if(s.charAt(i)!="SOS".charAt(i%3))c++;
        return c;
    }
    public static void main(String[]x) {
        System.out.println(marsExploration("SOSTOT"));
    }
}
