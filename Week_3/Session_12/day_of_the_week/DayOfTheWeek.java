// Week 3 | Session 12 | Day of the Week
// Original practice problem: https://leetcode.com/problems/day-of-the-week/
// Run: javac DayOfTheWeek.java && java DayOfTheWeek

import java.time.*;
public class DayOfTheWeek {
    static String dayOfTheWeek(int d,int m,int y) {
        return LocalDate.of(y,m,d).getDayOfWeek().getDisplayName(java.time.format.TextStyle.FULL,java.util.Locale.US);
    }
    public static void main(String[]x) {
        System.out.println(dayOfTheWeek(31,8,2019));
    }
}
