// Week 5 | Session 5 | Naive Pattern Search
// Original practice problem: https://www.geeksforgeeks.org/dsa/naive-algorithm-for-pattern-searching/
// Run: javac NaivePatternSearch.java && java NaivePatternSearch

public class NaivePatternSearch {
    static void search(String text,String pat) {
        for(int i=0;i<=text.length()-pat.length();i++)if(text.regionMatches(i,pat,0,pat.length()))System.out.print(i+" ");
        System.out.println();
    }
    public static void main(String[]x) {
        search("AABAACAADAABAABA","AABA");
    }
}
