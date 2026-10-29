// Week 1 | Session 1 | Java Lambda Expressions
// Original practice problem: https://www.hackerrank.com/challenges/java-lambda-expressions/problem
// Run: javac JavaLambdaExpressions.java && java JavaLambdaExpressions

import java.util.*;
import java.util.function.*;
public class JavaLambdaExpressions {
    public static void main(String[] args) {
        Predicate<Integer> isOdd = n -> n % 2 != 0;
        Predicate<Integer> isPrime = n -> n > 1 && java.util.stream.IntStream.rangeClosed(2,(int)Math.sqrt(n)).noneMatch(d -> n % d == 0);
        Predicate<Integer> isPalindrome = n -> new StringBuilder(String.valueOf(n)).reverse().toString().equals(String.valueOf(n));
        for (int n : new int[] {
            7, 12, 121
        }
        ) System.out.println(n + ": odd=" + isOdd.test(n) + ", prime=" + isPrime.test(n) + ", palindrome=" + isPalindrome.test(n));
    }
}
