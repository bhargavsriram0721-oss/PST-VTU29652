// Week 4 | Session 3 | Time Conversion
// Original practice problem: https://www.hackerrank.com/challenges/time-conversion/problem
// Run: javac TimeConversion.java && java TimeConversion

public class TimeConversion {
    static String timeConversion(String s) {
        String ap=s.substring(8);
        int h=Integer.parseInt(s.substring(0,2));
        if(ap.equals("AM")) {
            if(h==12)h=0;
        } else if(h!=12)h+=12;
        return String.format("%02d",h)+s.substring(2,8);
    }
    public static void main(String[]x) {
        System.out.println(timeConversion("07:05:45PM"));
    }
}
