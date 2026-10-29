// Week 3 | Session 13 | Java Priority Queue
// Original practice problem: https://www.hackerrank.com/challenges/java-priority-queue/problem
// Run: javac JavaPriorityQueue.java && java JavaPriorityQueue

import java.util.*;
public class JavaPriorityQueue {
    public static void main(String[]x) {
        PriorityQueue<Integer> q=new PriorityQueue<>();
        q.add(5);
        q.add(1);
        q.add(3);
        while(!q.isEmpty())System.out.println(q.poll());
    }
}
