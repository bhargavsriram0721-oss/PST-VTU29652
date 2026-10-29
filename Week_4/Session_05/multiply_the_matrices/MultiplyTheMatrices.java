// Week 4 | Session 5 | Multiply the Matrices
// Original practice problem: https://www.geeksforgeeks.org/problems/multiply-the-matrices-1587115620/
// Run: javac MultiplyTheMatrices.java && java MultiplyTheMatrices

import java.util.*;
public class MultiplyTheMatrices {
    static int[][] multiply(int[][]a,int[][]b) {
        int[][]c=new int[a.length][b[0].length];
        for(int i=0;i<a.length;i++)for(int k=0;k<b.length;k++)for(int j=0;j<b[0].length;j++)c[i][j]+=a[i][k]*b[k][j];
        return c;
    }
    public static void main(String[]x) {
        System.out.println(Arrays.deepToString(multiply(new int[][] {
            {
                1,2
            }
            , {
                3,4
            }
        }
        ,new int[][] {
            {
                5,6
            }
            , {
                7,8
            }
        }
        )));
    }
}
