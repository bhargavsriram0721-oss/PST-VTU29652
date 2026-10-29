// Week 1 | Session 3 | Sorting Comparator
// Original practice problem: https://www.hackerrank.com/challenges/ctci-comparator-sorting/problem
// Run: javac SortingComparator.java && java SortingComparator

import java.util.*;
public class SortingComparator {
    static class Player {
        String name;
        int score;
        Player(String n,int s) {
            name=n;
            score=s;
        }
    }
    public static void main(String[] args) {
        List<Player> p=Arrays.asList(new Player("amy",100),new Player("david",100),new Player("heraldo",50));
        p.sort(Comparator.comparingInt((Player x)->x.score).reversed().thenComparing(x->x.name));
        p.forEach(x->System.out.println(x.name+" "+x.score));
    }
}
