// Week 3 | Session 14 | Java Comparator
// Original practice problem: https://www.hackerrank.com/challenges/java-comparator/problem
// Run: javac JavaComparator.java && java JavaComparator

import java.util.*;
public class JavaComparator {
    static class Student {
        int id;
        String name;
        double cgpa;
        Student(int id, String name, double cgpa) {
            this.id = id;
            this.name = name;
            this.cgpa = cgpa;
        }
    }
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
        new Student(1, "Alice", 3.9),
        new Student(2, "Bob", 3.9),
        new Student(3, "Cara", 3.7)
        );
        students.sort(
        Comparator.comparingDouble((Student s) -> s.cgpa)
        .reversed()
        .thenComparing(s -> s.name)
        .thenComparingInt(s -> s.id)
        );
        students.forEach(s -> System.out.println(s.name));
    }
}
