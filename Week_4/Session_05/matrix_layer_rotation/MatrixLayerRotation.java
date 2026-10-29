// Week 4 | Session 5 | Matrix Layer Rotation
// Original practice problem: https://www.hackerrank.com/challenges/matrix-rotation-algo/problem
// Run: javac MatrixLayerRotation.java && java MatrixLayerRotation

import java.util.*;
public class MatrixLayerRotation {
    static int[][] rotate(int[][]a,int r) {
        int m=a.length,n=a[0].length;
        int[][]o=new int[m][n];
        for(int i=0;i<m;i++)o[i]=a[i].clone();
        for(int layer=0;layer<Math.min(m,n)/2;layer++) {
            List<int[]>pos=new ArrayList<>();
            for(int j=layer;j<n-layer;j++)pos.add(new int[] {
                layer,j
            }
            );
            for(int i=layer+1;i<m-layer-1;i++)pos.add(new int[] {
                i,n-layer-1
            }
            );
            for(int j=n-layer-1;j>=layer;j--)pos.add(new int[] {
                m-layer-1,j
            }
            );
            for(int i=m-layer-2;i>layer;i--)pos.add(new int[] {
                i,layer
            }
            );
            int len=pos.size();
            int[]v=new int[len];
            for(int i=0;i<len;i++)v[i]=a[pos.get(i)[0]][pos.get(i)[1]];
            for(int i=0;i<len;i++) {
                int[]p=pos.get(i),q=pos.get((i+r)%len);
                o[q[0]][q[1]]=v[i];
            }
        }
        return o;
    }
    public static void main(String[]x) {
        System.out.println(Arrays.deepToString(rotate(new int[][] {
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
