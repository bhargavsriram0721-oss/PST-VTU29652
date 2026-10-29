// Week 5 | Session 1 | The Birthday Bar
// Original practice problem: https://www.hackerrank.com/challenges/the-birthday-bar/problem
// Run: javac TheBirthdayBar.java && java TheBirthdayBar

public class TheBirthdayBar {
    static int birthday(int[]s,int d,int m) {
        int c=0,sum=0;
        for(int i=0;i<s.length;i++) {
            sum+=s[i];
            if(i>=m)sum-=s[i-m];
            if(i>=m-1&&sum==d)c++;
        }
        return c;
    }
    public static void main(String[]x) {
        System.out.println(birthday(new int[] {
            1,2,1,3,2
        }
        ,3,2));
    }
}
