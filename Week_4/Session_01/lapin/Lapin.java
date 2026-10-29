// Week 4 | Session 1 | Lapin
// Original practice problem: https://www.codechef.com/problems/LAPIN
// Run: javac Lapin.java && java Lapin

import java.util.*;
public class Lapin {
    static boolean lapin(String s) {
        int n=s.length();
        int[] c=new int[26];
        for(int i=0;i<n/2;i++)c[s.charAt(i)-'a']++;
        for(int i=(n+1)/2;i<n;i++)c[s.charAt(i)-'a']--;
        for(int v:c)if(v!=0)return false;
        return true;
    }
    public static void main(String[]x) {
        System.out.println(lapin("gaga"));
    }
}
