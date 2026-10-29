// Week 6 | Session 2 | Rotate String
// Original practice problem: https://leetcode.com/problems/rotate-string/
// Run: javac RotateString.java && java RotateString

public class RotateString {
    static boolean rotateString(String s,String goal) {
        return s.length()==goal.length()&&(s+s).contains(goal);
    }
    public static void main(String[]x) {
        System.out.println(rotateString("abcde","cdeab"));
    }
}
