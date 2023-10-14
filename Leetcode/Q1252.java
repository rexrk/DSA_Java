package Leetcode;

import java.util.Arrays;

public class Q1252 {
    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int[][] ans = new int[m][n];
        int[][] indices = {
                {0, 1 },
                {1, 1}
        };

        for(int i = 0; i < indices.length; i++) {
            int r = indices[i][0];
            int c = indices[i][1];

            for(int row = 0; row < m; row++){
                ans[row][c] += 1;
            }
            for(int col = 0; col < ans[r].length; col++){
                ans[r][col] += 1;
            }

        }
        for (int[] num: ans) {
            System.out.println(Arrays.toString(num));
        }
    }
}
