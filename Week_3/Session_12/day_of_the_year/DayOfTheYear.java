// Week 3 | Session 12 | Day of the Year
// Original practice problem: https://leetcode.com/problems/day-of-the-year/
// Run: javac DayOfTheYear.java && java DayOfTheYear

import java.time.*;
public class DayOfTheYear {
    static int dayOfYear(String s) {
        return LocalDate.parse(s).getDayOfYear();
    }
    public static void main(String[]x) {
        System.out.println(dayOfYear("2019-01-09"));
    }
}
