// Week 2 | Session 8 | Find the Highest Altitude
// Original practice problem: https://leetcode.com/problems/find-the-highest-altitude/
// Run: javac FindTheHighestAltitude.java && java FindTheHighestAltitude

public class FindTheHighestAltitude {
    static int largestAltitude(int[] a) {
        int cur=0,best=0;
        for(int x:a) {
            cur+=x;
            best=Math.max(best,cur);
        }
        return best;
    }
    public static void main(String[]x) {
        System.out.println(largestAltitude(new int[] {
            -5,1,5,0,-7
        }
        ));
    }
}
