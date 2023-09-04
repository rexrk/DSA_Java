package Leetcode;

import java.util.ArrayList;

//1631. Path With Minimum Effort
public class Q1631 {
    public static void main(String[] args) {
        int[][] heights = {
                {1, 2, 1, 1, 1},
                {1, 2, 1, 2, 1},
                {1, 2, 1, 2, 1},
                {1, 2, 1, 2, 1},
                {1, 1, 1, 2, 1}
        };
        int minDiff = Integer.MAX_VALUE;
        ArrayList<Integer> list = new ArrayList<>();
        boolean[][] board = new boolean[heights.length][heights[0].length];
        trace("", heights, 0, 0, board, 0, 0, list);
        for (int num : list) {
            if (num < minDiff) {
                minDiff = num;
            }
        }
        System.out.println(minDiff);
    }

    private static void trace(String p, int[][] heights, int r, int c, boolean[][] board, int maxDiff, int prevHeight, ArrayList<Integer> minDiff) {
        if (r == heights.length - 1 && c == heights[r].length - 1) {
            maxDiff = Math.max(Math.abs(heights[r][c] - prevHeight), maxDiff);
            minDiff.add(maxDiff);
            System.out.println(p + " : " + maxDiff);
            return;
        }

        if (board[r][c]) {
            return;
        }

        board[r][c] = true;

        maxDiff = Math.max(Math.abs(prevHeight - heights[r][c]), maxDiff);
        //logic
        if (r < board.length - 1) {
            //down
            trace(p + "D", heights, r + 1, c, board, maxDiff, heights[r][c], minDiff);
        }

        if (c < board.length - 1) {
            //right
            trace(p + "R", heights, r, c + 1, board, maxDiff, heights[r][c], minDiff);
        }

        if (r > 0) {
            trace(p + "U", heights, r - 1, c, board, maxDiff, heights[r][c], minDiff);
        }

        if (c > 0) {
            trace(p + "L", heights, r, c - 1, board, maxDiff, heights[r][c], minDiff);
        }

        board[r][c] = false;

    }
}
