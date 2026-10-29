// Week 6 | Session 1 | String Similarity
// Original practice problem: https://www.hackerrank.com/challenges/string-similarity/
// Run: javac StringSimilarity.java && java StringSimilarity

public class StringSimilarity {
    static long stringSimilarity(String s) {
        long total=0;
        for(int i=0;i<s.length();i++) {
            int j=0;
            while(i+j<s.length()&&s.charAt(j)==s.charAt(i+j))j++;
            total+=j;
        }
        return total;
    }
    public static void main(String[]x) {
        System.out.println(stringSimilarity("ababaa"));
    }
}
