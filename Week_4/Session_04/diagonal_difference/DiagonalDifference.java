// Week 4 | Session 4 | Diagonal Difference
// Original practice problem: https://www.hackerrank.com/challenges/diagonal-difference/problem
// Run: javac DiagonalDifference.java && java DiagonalDifference

public class DiagonalDifference {
    static int diagonalDifference(int[][] a) {
        int n=a.length,p=0,q=0;
        for(int i=0;i<n;i++) {
            p+=a[i][i];
            q+=a[i][n-1-i];
        }
        return Math.abs(p-q);
    }
    public static void main(String[]x) {
        System.out.println(diagonalDifference(new int[][] {
            {
                11,2,4
            }
            , {
                4,5,6
            }
            , {
                10,8,-12
            }
        }
        ));
    }
}
