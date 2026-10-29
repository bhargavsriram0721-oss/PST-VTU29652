// Week 1 | Session 4 | Richest Customer Wealth
// Original practice problem: https://leetcode.com/problems/richest-customer-wealth/
// Run: javac RichestCustomerWealth.java && java RichestCustomerWealth

public class RichestCustomerWealth {
    static int maximumWealth(int[][] a) {
        int best=0;
        for(int[] row:a) {
            int s=0;
            for(int x:row)s+=x;
            best=Math.max(best,s);
        }
        return best;
    }
    public static void main(String[] z) {
        System.out.println(maximumWealth(new int[][] {
            {
                1,2,3
            }
            , {
                3,2,1
            }
        }
        ));
    }
}
