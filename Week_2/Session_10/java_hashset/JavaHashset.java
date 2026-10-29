// Week 2 | Session 10 | Java Hashset
// Original practice problem: https://www.hackerrank.com/challenges/java-hashset/problem
// Run: javac JavaHashset.java && java JavaHashset

import java.util.*;
public class JavaHashset {
    public static void main(String[]x) {
        String[][] pairs= {
            {
                "john","tom"
            }
            , {
                "john","mary"
            }
            , {
                "john","tom"
            }
            , {
                "anna","tom"
            }
        }
        ;
        Set<String>s=new HashSet<>();
        for(String[]p:pairs) {
            s.add(p[0]+" "+p[1]);
            System.out.println(s.size());
        }
    }
}
