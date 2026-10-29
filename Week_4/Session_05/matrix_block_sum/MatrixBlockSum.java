// Week 4 | Session 5 | Matrix Block Sum
// Original practice problem: https://leetcode.com/problems/matrix-block-sum/
// Run: javac MatrixBlockSum.java && java MatrixBlockSum

import java.util.*;
public class MatrixBlockSum {
    static int[][] matrixBlockSum(int[][]a,int k) {
        int m=a.length,n=a[0].length;
        int[][]p=new int[m+1][n+1],o=new int[m][n];
        for(int i=1;i<=m;i++)for(int j=1;j<=n;j++)p[i][j]=a[i-1][j-1]+p[i-1][j]+p[i][j-1]-p[i-1][j-1];
        for(int i=0;i<m;i++)for(int j=0;j<n;j++) {
            int r1=Math.max(0,i-k),c1=Math.max(0,j-k),r2=Math.min(m-1,i+k),c2=Math.min(n-1,j+k);
            o[i][j]=p[r2+1][c2+1]-p[r1][c2+1]-p[r2+1][c1]+p[r1][c1];
        }
        return o;
    }
    public static void main(String[]x) {
        System.out.println(Arrays.deepToString(matrixBlockSum(new int[][] {
            {
                1,2,3
            }
            , {
                4,5,6
            }
            , {
                7,8,9
            }
        }
        ,1)));
    }
}
