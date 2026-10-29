// Week 2 | Session 10 | Java Dequeue
// Original practice problem: https://www.hackerrank.com/challenges/java-dequeue/problem
// Run: javac JavaDequeue.java && java JavaDequeue

import java.util.*;
public class JavaDequeue {
    public static void main(String[]x) {
        int[] a= {
            5,3,5,2,3,2
        }
        ;
        int k=3,max=0;
        Set<Integer>s=new HashSet<>();
        for(int i=0;i<a.length;i++) {
            s.add(a[i]);
            if(i>=k)s.remove(a[i-k]);
            if(i>=k-1)max=Math.max(max,s.size());
        }
        System.out.println(max);
    }
}
