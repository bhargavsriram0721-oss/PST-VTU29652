// Week 2 | Session 9 | Top K Frequent Elements
// Original practice problem: https://leetcode.com/problems/top-k-frequent-elements/
// Run: javac TopKFrequentElements.java && java TopKFrequentElements

import java.util.*;
public class TopKFrequentElements {
    static int[] topKFrequent(int[] a,int k) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int x:a)m.merge(x,1,Integer::sum);
        return m.entrySet().stream().sorted((u,v)->v.getValue()-u.getValue()).limit(k).mapToInt(Map.Entry::getKey).toArray();
    }
    public static void main(String[]x) {
        System.out.println(Arrays.toString(topKFrequent(new int[] {
            1,1,1,2,2,3
        }
        ,2)));
    }
}
