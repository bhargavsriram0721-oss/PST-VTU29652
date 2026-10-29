// Week 1 | Session 3 | Java Comparator
// Original practice problem: https://www.hackerrank.com/challenges/java-comparator/problem
// Run: javac JavaComparator.java && java JavaComparator

import java.util.*;
public class JavaComparator {
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
        List<Student> s=Arrays.asList(new Student(1,"Alice",3.9),new Student(2,"Bob",3.9),new Student(3,"Cara",3.7));
        s.sort(Comparator.comparingDouble((Student x)->x.cgpa).reversed().thenComparing(x->x.name).thenComparingInt(x->x.id));
        s.forEach(x->System.out.println(x.name));
    }
}
