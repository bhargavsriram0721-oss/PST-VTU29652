// Week 3 | Session 11 | Number of Days Between Two Dates
// Original practice problem: https://leetcode.com/problems/number-of-days-between-two-dates/
// Run: javac NumberOfDaysBetweenTwoDates.java && java NumberOfDaysBetweenTwoDates

import java.time.*;
import java.time.temporal.ChronoUnit;
public class NumberOfDaysBetweenTwoDates {
    static int daysBetween(String a,String b) {
        return (int)Math.abs(ChronoUnit.DAYS.between(LocalDate.parse(a),LocalDate.parse(b)));
    }
    public static void main(String[]x) {
        System.out.println(daysBetween("2019-06-29","2019-06-30"));
    }
}
