// Week 3 | Session 11 | Java Date and Time
// Original practice problem: https://www.hackerrank.com/challenges/java-date-and-time/problem
// Run: javac JavaDateAndTime.java && java JavaDateAndTime

import java.time.*;
public class JavaDateAndTime {
    public static void main(String[]x) {
        LocalDate d=LocalDate.of(2015,8,5);
        System.out.println(d.getDayOfWeek().toString());
    }
}
