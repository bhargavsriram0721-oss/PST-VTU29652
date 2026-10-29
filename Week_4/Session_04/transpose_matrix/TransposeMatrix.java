// Week 4 | Session 4 | Transpose Matrix
// Original practice problem: https://leetcode.com/problems/transpose-matrix/
// Run: javac TransposeMatrix.java && java TransposeMatrix

import java.util.*;
public class TransposeMatrix {
    static int[][] transpose(int[][] a) {
        int[][]b=new int[a[0].length][a.length];
        for(int i=0;i<a.length;i++)for(int j=0;j<a[0].length;j++)b[j][i]=a[i][j];
        return b;
    }
    public static void main(String[]x) {
        System.out.println(Arrays.deepToString(transpose(new int[][] {
            {
                1,2,3
            }
            , {
                4,5,6
            }
        }
        )));
    }
}
