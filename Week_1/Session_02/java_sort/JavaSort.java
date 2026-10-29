// Week 1 | Session 2 | Java Sort
// Original practice problem: https://www.hackerrank.com/challenges/java-sort/problem
// Run: javac JavaSort.java && java JavaSort

import java.util.*;
public class JavaSort {
    static class Student {
        int id;
        String name;
        double cgpa;
        Student(int i,String n,double c) {
            id=i;
            name=n;
            cgpa=c;
        }
    }
    public static void main(String[] args) {
        List<Student> a = new ArrayList<>(Arrays.asList(new Student(33,"Tina",3.68),new Student(85,"Louis",3.85),new Student(56,"Samar",3.75)));
        a.sort(Comparator.comparingDouble((Student s)->s.cgpa).reversed().thenComparing(s->s.name).thenComparingInt(s->s.id));
        a.forEach(s->System.out.println(s.name+" "+s.cgpa));
    }
}
