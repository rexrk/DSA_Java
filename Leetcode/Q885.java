package Leetcode;

import java.util.Arrays;

public class Q885 {
    public static void main(String[] args) {
        int[][] matrix = spiralMatrixIII(5, 6,1 ,4);
        for (int[] boo: matrix
             ) {
            System.out.println(Arrays.toString(boo));
        }
    }
    public static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] visited = new int[rows*cols][2];
        boolean[][] matrix = new boolean[rows][cols];
        int rLength = rows - 1;
        int cLength = cols - 1;

        int i = 0;

        while(i < rows * cols) {

            matrix[rStart][cStart] = true;
            visited[i][0] = rStart;
            visited[i][1] = cStart;
            i += 1;

            //going right one step
            while(cStart <= cLength) {
                if(!matrix[rStart][cStart]){
                    matrix[rStart][cStart] = true;
                    visited[i][0] = rStart;
                    visited[i][1] = cStart;
                    i += 1;
                    break;
                }
                if(cStart < cLength) cStart++;
            }

            //going right to down
            while(rStart <= rLength) {
                if(!matrix[rStart][cStart]){
                    matrix[rStart][cStart] = true;
                    visited[i][0] = rStart;
                    visited[i][1] = cStart;
                    i += 1;
                    break;

                }
                if(rStart < rLength) rStart++;
            }

            //going bottom right to left
            break;

        }

        return visited;
    }
}
